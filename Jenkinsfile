pipeline {
    # required docker, ant and java
    agent any

    stages {
        stage('Build') {
            sh 'ant -f build.xml -v'
        }
    }
}