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
                 sh 'mvn clean install'
                }
            }



            stage ('Deploy') {

              steps {
                sh 'echo y | ./pscp -pw bbcc11223344 ./target/spring.boot.play-1.0-SNAPSHOT.jar ion@10.10.9.58:/tmp'
              }

            }
        }
        post {
                always {
                    junit 'target/surefire-reports/**/*.xml'
                }
         }


}