pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Hello'
      }
    }
    stage('Test') {
      steps {
        bat 'ls'
        pwd()
      }
    }
    stage('Deploy') {
      steps {
        echo 'Done'
      }
    }
  }
}