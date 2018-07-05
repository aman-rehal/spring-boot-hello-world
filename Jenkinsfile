pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               echo 'Starting pipeline build.'
               sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}