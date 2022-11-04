pipeline {
    agent any
  tools{
    maven 'mvn'
    jdk 'Java8'
    }
    stages {
        stage('Hello') {
            steps {
                git 'https://github.com/afarane/Amazon_Selenium_Demo.git'
                sh 'mvn package'
            }
        }
    }
}
