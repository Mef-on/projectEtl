pipeline {
    agent any
    tools {
        maven '3.9.2'
        jdk '11'
        }
    stages {
        stage('Build') {
            steps {
                sh 'java -version'
                echo 'building project...'
                sh 'mvn clean install'
            }
        }
         stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
