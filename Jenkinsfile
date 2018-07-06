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
             sh 'mvn clean install'
        }
    }
}
}