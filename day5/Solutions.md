DAY 5 JENKINS

Assignment 1

Create Job DSL for 
1. helloworld Job 
  
job('hello world') {

   steps {

     shell('echo “hello world”')

      }

   }

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/parameterised-hello-world.png)
 


2. hellotoperson Job (Take SALUTATION as choice parameter & NAME as string parameter) 

job('hello person') {

   parameters {

      stringParam('Name', ' ')

      choiceParam('Salutation', ['Mr.', 'Mrs.'])

      }

   steps {

     shell('echo “Hello $Salutation $Name”')

      }

   }

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/hello-person.png)

 

3. Gitclone and list content of cloned directory

job('hello git') {

   scm {

       git('https://github.com/lovedeepsh/jenkins.git')

       }

   steps {

       shell('ls -al')

       } 

   }

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/gitclone.png)


4. buildperiodically Job (This job will run by every 5 min) 

job('hello periodical') {

   scm {

       git('https://github.com/lovedeepsh/jenkins.git')

       }

       triggers {

       cron('*/5 * * * * ')

       }

       steps {

       shell('ls -al')

       } 

   }

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/crongroovy.png)


5. pollscm Job (This job will have a poll interval of 2 min) 

job('hello pol') {

   scm {

       git('https://github.com/lovedeepsh/jenkins.git')

       }

       triggers {

       scm('*/2 * * * * ')

       }

       steps {

       shell('ls -al')

       } 

   }

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/hellopoll.png)
 

6. upstream Job (This job have helloworld job as upstream) 

job('hello upstream') {

   triggers {

       upstream('parameterised-hello-world', 'SUCCESS')

       }

   steps {

       shell('echo “This is downstream”')

       } 

   }

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/upstream.png)



7. downstream Job ( This job have hellotoperson job as downstream. Note: Pass variable(SALUTATION & NAME) from this job to hellotoperson job.) 

job('hello downstream') {
    
    steps {
    
        downstreamParameterized {
    
        trigger('hello person') {

                block {

                    buildStepFailure('FAILURE')

                    failure('FAILURE')

                    unstable('UNSTABLE')

                }

                parameters {

                    predefinedProps([Salutation: 'Mr.', Name: 'Lovedeep'])

                }

            }
            

            }

        }
    
        }

			
8. nestedview Job ( This job will create a nested view named as 'ninja-jobs' with folders 'simple-jobs' & 'complex-jobs'. simple-jobs will contain helloworld, hellotoperson, Gitclone, buildperiodically and pollscm. complex-jobs will contain upstream and downstream jobs.) 

job('ninja-jobs') {
  
  nestedView('simple-jobs') {
  
    views {
  
        listView('"parameterized-hello-world", "hello person", "hello git", "hello periodical", "hello poll"') 
  
      {         
  
          columns {

          status()

          weather()

          name()

          lastSuccess()

          lastFailure()

            }

        }

        }

        }
 
      nestedView('coplex-jobs') {
 
    views {
 
        listView('"hello upstream", "hello downstream"') {
 
            columns {
 
            status()

            weather()

            name()

            lastSuccess()

            lastFailure()

            }

        }

        }  
    
        }
    
        }

         

Assignment2:

Write Job DSL to Setup CI/CD (Java app) Jobs

tagcreation Job (check assignment of day7 for details).

codestability Job

codequality Job

codecoverage Job (The all 3 jobs will be based on Java project(Spring3HibernateApp) from ContinuousIntegration.)

deployment Job for war file (Deployed into tomcat7).

static-deployment Job for static file deployment in nginx (Deployment of static code i.e. index.html from day7 assignment).

job('helloCICD') {
  
  scm {
  
    git('https://github.com/lovedeepsh/ContinuousIntegration.git')
  
      }
    
      steps {
      
        maven {
     
        goals('deploy findbugs:findbugs checkstyle:checkstyle cobertura:cobertura')
 
        setRootPOM("Spring3HibernateApp/pom.xml")
  
        mavenInstallation('mvn3.5.3')
       
      shell('Spring3HibernateApp/target')
      
      shell('cp Spring3HibernateApp.war /var/lib/tomcat8/webapps/')
      
        }
            
            }
        
        }

NOT RUN YET PROPERLY BUT WILL BE UPDATED SOON.
