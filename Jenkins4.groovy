pipeline {
    agent any
    
    tools {
        // Define tools to be used in the pipeline
        jdk 'jdk11'
        maven 'maven'
    }

    stages {
        stage('Git Checkout') {
            steps {
                // Checkout code from the specified Git repository
                git branch: 'main', url: 'https://github.com/Jagata8/Task4.git'
            }
        }
        
        stage('Code Compile') {
            steps {
                // Compile the code using Maven
                bat label: 'Compile', script: 'mvn clean compile'
            }
        }
        
        stage('Unit Tests') {
            steps {
                // Run unit tests using Maven
                bat label: 'Run Tests', script: 'mvn test'
            }
        }
    }
}
