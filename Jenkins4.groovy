pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Checkout code from Git repository
                git branch: 'main', url: 'https://github.com/Jagata8/Task4.git'
                
                // Build the Java project 
                sh 'mvn clean compile'
            }
        }
    }
}
