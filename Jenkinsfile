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

    // post build steps
    post {
        // no matter what happens in any prior stage, we will always archive the jar file
        always {
            // any JAR file insise dist folder should be archived
            archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
        }
    }
}