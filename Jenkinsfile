pipeline {

    // use agent none if each stage may be executed on differente nodes
    agent none

    stages {

        stage('Junit Test') {

            agent {
                label 'apache'
            }

            steps {
                sh 'ant -f test.xml -v'                
                junit 'reports/result.xml'
            }
        }

        stage('Build') {

            agent {
                label 'apache'
            }

            steps {
                sh 'ant -f build.xml -v'
            }

        }

        stage ('deploy') {

            agent {
                label 'apache'
            }

            steps {
                sh "cp dist/rectangle_${env.BUILD_NUMBER}.jar /var/www/html/rectangles/all"
            }
        }

        stage ('Running on CentOS') {

            agent {
                label 'CentOS'
            }

            steps {
                sh "wget http://fernandoporres1.mylabserver.com/rectangles/all/rectangle_${env.BUILD_NUMBER}.jar"
                sh "java -jar rectangle_${env.BUILD_NUMBER}.jar 3 4"
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