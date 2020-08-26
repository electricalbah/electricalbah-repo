pipeline { 
    agent {
        docker {
            image 'payara/server-full'
            args '-d -p 4848:4848 -p 8080:8080 -p 8181:8181 -p 9009:9009 -v /var/run/docker.sock:/var/run/docker.sock -v /Users/mamadu.bah/workspace/Docker/Volumes/payara/deploy/:/opt/payara/deployments --name basco-payara-img'
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
