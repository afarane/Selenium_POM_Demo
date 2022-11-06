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
                sh 'mvn clean install'
            }
        }
        stage('Test') {
        	steps{
        		sh 'mvn Test'
        	}
        	post{
        		always{
        			junit skipPublishingChecks: true, testResults: '**/target/surefire-reports/TEST-*.xml'
        		}
        	}
        }
    }
}
