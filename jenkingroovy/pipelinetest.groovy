 node {
        stage ('clone') {
          build job: 'hello git'
        }
        stage('coverage test') {
          build job: 'codecoverage'
        }
        stage('person') {
          build job: 'hello person'
        }
        stage('poll') {
          build job: 'hello poll'
        }
    }
