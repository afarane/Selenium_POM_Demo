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
        		sh 'mvn test'
        	}
        	post{
        		always{
        			 junit skipPublishingChecks: true, testResults: '**/target/surefire-reports/TEST-*.xml'
        			// testNG(reportFilenamePattern: '**/testng-many-results.xml')
        		}
        	}
        }
        stage('Publish') {
        	steps{
        		sh 'mvn package'
        	}
        	post{
        		success{
        			archiveArtifacts 'target/*.jar'
        		}
        	}
        }
        
    }
}
