pipeline {
    agent any

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                '''
            }
        }

        stage ('Build') {
            steps {

             withMaven(maven : 'Maven 3.3.9') {
                sh 'mvn clean install'
             }


        }
    }
}