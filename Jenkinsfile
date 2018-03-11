pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''mvn --version;
            java -veresion;mvn clean;mvn package'''
      }
    }
    stage('deploy') {
      steps {
        sh '''cd target;
            java -jar smartzone-1.0-SNAPSHOT.jar'''
      }
    }
  }
}