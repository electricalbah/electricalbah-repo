pipeline { 
    agent {
        docker {
            image 'payara/server-full'
            args '-u root:sudo -d -p 4848:4848 -p 8080:8080 -p 8181:8181 -p 9009:9009 -v /Users/mamadu.bah/workspace/Docker/Volumes/payara/deploy/:/opt/payara/deployments --name basco-payara-img1'
        }
    }
    stages {
        stage('Build') { 
            steps { 
                sh "echo 'building..'"
            }
        }
        stage('Test'){
            steps {
                sh "echo 'Testing...'" 
            }
        }
        stage('Deploy') {
            steps {
                sh "echo 'Deploying...'"
            }
        }
    }
}
