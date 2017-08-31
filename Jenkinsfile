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