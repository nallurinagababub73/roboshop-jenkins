def call() {
    pipeline {
        agent {
            node { label 'workstation' }
        }

        stages {

            stage ('test') {
                steps {
                    sh 'echo test'
                    // sh 'python -m unittest'

                }
            }
            stage ('Code analysis') {
                steps {
                    sh 'echo Code analysis'
                    //sh 'sonar-scanner -Dsonar.host.url=http://172.31.89.167:9000 -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.projectKey=payment'


                }
            }
            stage ('Security scans') {
                steps {
                    sh 'echo Security scans'

                }
            }
            stage ('Publish an artifactory') {
                when {
                    expression { env.TAG_NAME ==~ ".*" }
                }
                steps {
                    sh 'echo Publish an artifactory'

                }
            }
        }
    }
}