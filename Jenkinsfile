pipeline {

    // required docker, ant and java
    agent {
        label 'master'
    }

    stages {

        stage('Junit Test') {
            steps {
                sh 'ant -f test.xml -v'                
                junit 'reports/result.xml'
            }
        }

        stage('Build') {
            steps {
                sh 'ant -f build.xml -v'
            }

        }

        stage ('deploy') {
            steps {
                sh "cp dist/rectangle_{env.BUILD_NUMBER}.jar /var/www/html/rectangles/all"
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