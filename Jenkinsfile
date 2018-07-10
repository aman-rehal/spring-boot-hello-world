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

        stage ('Deploy') {
          steps {
            sh 'curl --insecure --user ion:bbcc11223344 -T spring.boot.play-1.0-SNAPSHOT.jar sftp://10.10.9.58/tmp/'
          }
        }

    }
}