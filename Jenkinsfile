pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }

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
             sh 'mvn install'
            }
        }

        stage ('Run') {
            steps {
                 sh 'java -jar ./target/spring.boot.play-1.0-SNAPSHOT.jar'
            }
        }
    }
}