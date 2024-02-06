pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Checkout code from Git repository
                git 'https://github.com/Jagata8/Task4.git'
                
                // Build the Java project (replace with your build commands)
                sh 'mvn clean install'
            }
        }
    }
}
