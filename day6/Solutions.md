DAY 6 JENKINS

Assignment 1

1. Create a scripted pipeline that will containe different stages of a CI/CD pipeline. Include all CI and CD jobs. 

2. Insert manual approval before deployment job. 

3. Restrict manual approval for a specific user Here is just a test practice of pipeline which i performed today. Will cover the proper topics for sure.

Pipeline

1. Jenkins Pipeline is a suite of plugins which supports implementing and integrating continuous delivery pipelines into Jenkins.

2. A continuous delivery (CD) pipeline is an automated expression of your process for getting software from version control right through to your users and customers.

3. Every change to your software (committed in source control) goes through a complex process on its way to being released.

4. This process involves building the software in a reliable and repeatable manner, as well as progressing the built software (called a "build") through multiple stages of testing and deployment.

Code: Pipelines are implemented in code and typically checked into source control, giving teams the ability to edit, review, and iterate upon their delivery pipeline.

Durable: Pipelines can survive both planned and unplanned restarts of the Jenkins master.

Pausable: Pipelines can optionally stop and wait for human input or approval before continuing the Pipeline run.

Versatile: Pipelines support complex real-world CD requirements, including the ability to fork/join, loop, and perform work in parallel.

Extensible: The Pipeline plugin supports custom extensions to its DSL [1] and multiple options for integration with other plugins.


Here is the Git link for groovy script :-

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day6%20images/pipeline.png)

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day6%20images/pipeline2.png)


 jenkins/jenkins day6 images/pipeline2.png 

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


