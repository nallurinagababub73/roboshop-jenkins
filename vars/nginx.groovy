def call() {
    pipeline {
        agent {
            node { label 'workstation' }
        }

        stages {

            stage ('test') {
                steps {
                    sh 'echo test'

                }
            }
            stage ('Code analysis') {
                steps {
                    sh 'echo Code analysis'
                    //sh 'sonar-scanner -Dsonar.host.url=http://172.31.89.167:9000 -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.projectKey=frontend -Dsonar.qualitygate.wait=true'


                }
            }
            stage ('Security scans') {
                steps {
                    sh 'echo Security scans'

                }
            }
            stage ('Publish an artifactory') {
                steps {
                    sh 'echo Publish an artifactory'

                }
            }
        }
    }
}