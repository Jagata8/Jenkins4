pipeline {
    agent any
    tools {
        jdk 'jdk11'
        maven 'maven'
    }

    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Jagata8/Task4.git'
            }
        }
        stage('Code Compile') {
            steps {
                bat label: 'Compile', script: 'mvn clean compile'
            }
        }
        stage('Unit Tests') {
            steps {
                bat label: 'Run Tests', script: 'mvn test'
            }
        }
