pipeline {
    // required docker, ant and java
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'ant -f build.xml -v'
            }

        }
    }
}