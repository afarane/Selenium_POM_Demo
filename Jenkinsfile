pipeline {
    agent any
  tools{
    maven 'mvn'
    jdk 'Java8'
    }
    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/afarane/Amazon_Selenium_Demo.git'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
        	steps{
        		sh 'mvn Test'
        	}
        	post{
        		always{
        			junit '**/target/surefire-reports/TEST-*.xml'
        		}
        	}
        }
    }
}
