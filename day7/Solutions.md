DAY 7 JENKINS

Assignment 1

1.Create 2 slave and them to jenkins master.

- Create ssh connection between master and slave machines.

- Add the ssh credential in the Jenkins UI credentials.

- Go to Manage Jenkins.

- Click on Manage nodes.

- Click on New Node on the left side.

- Provide Node Name and select Permanent agent.

- Then provide name, description, no. of executors, remote root directory.

- Launch method vis ssh.

- Provide host name and credentials & click save.

- Click on the nodes one by one and then click launch node.

- Now the nodes are being started.

- I have added 2 nodes i.e. vagrant, lovedeep.

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day7%20images/master-slave.png)


  
   

2. Restrict jobs for a specific jenkins slave.

- Click on any particular job which you want to restrict for a specific jenkins slave.

- Click on Configure job.

- Click on the checkbox for “Restrict where this project can be run” in General section of that particular job.

- Give the name of slave in the box of Label expression.

- Click on save at the end and start a build for that job.

- Now check that your job is running on that particular slave.

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day7%20images/restrictslave.png)


![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day7%20images/restrictslaveoutput.png)





 
3. Create a job that can run on either salve(any of the two).

- Provided the same label to both the nodes while configuring them.

- Gave the name “multiple”

- Now, I gave the label expression “multiple” in the configuration of the various jobs.

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day7%20images/multnode.png)



Assignment 2

Use jenkins rest api to 

1. Get the list of all jobs 

# curl -u lovedeepsh:b64f2444a08e4169cf8c844cfe568d82 http://192.168.33.16:8080/api/json?pretty=true

{
  "_class" : "hudson.model.Hudson",
  "assignedLabels" : [
    {
      "name" : "master"
    }
  ],
  "mode" : "NORMAL",
  "nodeDescription" : "the master Jenkins node",
  "nodeName" : "",
  "numExecutors" : 5,
  "description" : null,
  "jobs" : [
    {
      "_class" : "hudson.maven.MavenModuleSet",
      "name" : "codecoverage",
      "url" : "http://192.168.33.16:8080/job/codecoverage/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "codestability",
      "url" : "http://192.168.33.16:8080/job/codestability/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.maven.MavenModuleSet",
      "name" : "codestability2",
      "url" : "http://192.168.33.16:8080/job/codestability2/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.maven.MavenModuleSet",
      "name" : "codestabilityday3",
      "url" : "http://192.168.33.16:8080/job/codestabilityday3/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "Deployer",
      "url" : "http://192.168.33.16:8080/job/Deployer/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "emailtest",
      "url" : "http://192.168.33.16:8080/job/emailtest/",
      "color" : "blue"
    },
    {
      "_class" : "org.jenkinsci.plugins.workflow.job.WorkflowJob",
      "name" : "first",
      "url" : "http://192.168.33.16:8080/job/first/",
      "color" : "notbuilt"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "hello downstream",
      "url" : "http://192.168.33.16:8080/job/hello%20downstream/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "hello git",
      "url" : "http://192.168.33.16:8080/job/hello%20git/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "hello periodical",
      "url" : "http://192.168.33.16:8080/job/hello%20periodical/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "hello person",
      "url" : "http://192.168.33.16:8080/job/hello%20person/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "hello poll",
      "url" : "http://192.168.33.16:8080/job/hello%20poll/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "hello upstream",
      "url" : "http://192.168.33.16:8080/job/hello%20upstream/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "helloCICD",
      "url" : "http://192.168.33.16:8080/job/helloCICD/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.maven.MavenModuleSet",
      "name" : "helloCICD2",
      "url" : "http://192.168.33.16:8080/job/helloCICD2/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "ninja-jobs",
      "url" : "http://192.168.33.16:8080/job/ninja-jobs/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "parameterized-hello-world",
      "url" : "http://192.168.33.16:8080/job/parameterized-hello-world/",
      "color" : "blue"
    },
    {
      "_class" : "org.jenkinsci.plugins.workflow.job.WorkflowJob",
      "name" : "pipeline1",
      "url" : "http://192.168.33.16:8080/job/pipeline1/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "SeedJob",
      "url" : "http://192.168.33.16:8080/job/SeedJob/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.maven.MavenModuleSet",
      "name" : "seedjobm",
      "url" : "http://192.168.33.16:8080/job/seedjobm/",
      "color" : "notbuilt"
    },
    {
      "_class" : "hudson.maven.MavenModuleSet",
      "name" : "Spring3HibernateApp",
      "url" : "http://192.168.33.16:8080/job/Spring3HibernateApp/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.maven.MavenModuleSet",
      "name" : "staticcodeanalysis",
      "url" : "http://192.168.33.16:8080/job/staticcodeanalysis/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "TagCreator",
      "url" : "http://192.168.33.16:8080/job/TagCreator/",
      "color" : "blue"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "test",
      "url" : "http://192.168.33.16:8080/job/test/",
      "color" : "notbuilt"
    },
    {
      "_class" : "hudson.model.FreeStyleProject",
      "name" : "testm",
      "url" : "http://192.168.33.16:8080/job/testm/",
      "color" : "blue"
    }
  ],
  "overallLoad" : {
    
  },
  "primaryView" : {
    "_class" : "hudson.model.AllView",
    "name" : "all",
    "url" : "http://192.168.33.16:8080/"
  },
  "quietingDown" : false,
  "slaveAgentPort" : -1,
  "unlabeledLoad" : {
    "_class" : "jenkins.model.UnlabeledLoadStatistics"
  },
  "useCrumbs" : true,
  "useSecurity" : true,
  "views" : [
    {
      "_class" : "hudson.model.AllView",
      "name" : "all",
      "url" : "http://192.168.33.16:8080/"
    },
    {
      "_class" : "hudson.plugins.nested_view.NestedView",
      "name" : "complex-jobs",
      "url" : "http://192.168.33.16:8080/view/complex-jobs/"
    },
    {
      "_class" : "hudson.plugins.nested_view.NestedView",
      "name" : "coplex-jobs",
      "url" : "http://192.168.33.16:8080/view/coplex-jobs/"
    },
    {
      "_class" : "hudson.plugins.nested_view.NestedView",
      "name" : "simple-jobs",
      "url" : "http://192.168.33.16:8080/view/simple-jobs/"
    }
  ]
}





2. Get the last build status 

# curl -u lovedeepsh:b64f2444a08e4169cf8c844cfe568d82 http://192.168.33.16:8080/job/helloCICD2/lastSuccessfulBuild/api/json

{"_class":"hudson.maven.MavenModuleSetBuild","actions":[{"_class":"hudson.model.CauseAction","causes":[{"_class":"hudson.model.Cause$UserIdCause","shortDescription":"Started by user LOVEDEEP SHARMA","userId":"lovedeepsh","userName":"LOVEDEEP SHARMA"}]},{"_class":"hudson.plugins.git.util.BuildData","buildsByBranchName":{"refs/remotes/origin/master":{"_class":"hudson.plugins.git.util.Build","buildNumber":1,"buildResult":null,"marked":{"SHA1":"87357a4c6054e980c7d2e0412a090bb4e687a1f9","branch":[{"SHA1":"87357a4c6054e980c7d2e0412a090bb4e687a1f9","name":"refs/remotes/origin/master"}]},"revision":{"SHA1":"87357a4c6054e980c7d2e0412a090bb4e687a1f9","branch":[{"SHA1":"87357a4c6054e980c7d2e0412a090bb4e687a1f9","name":"refs/remotes/origin/master"}]}}},"lastBuiltRevision":{"SHA1":"87357a4c6054e980c7d2e0412a090bb4e687a1f9","branch":[{"SHA1":"87357a4c6054e980c7d2e0412a090bb4e687a1f9","name":"refs/remotes/origin/master"}]},"remoteUrls":["https://github.com/lovedeepsh/ContinuousIntegration.git"],"scmName":""},{"_class":"hudson.plugins.git.GitTagAction"},{},{"_class":"hudson.maven.reporters.SurefireAggregatedReport","failCount":0,"skipCount":0,"totalCount":6,"urlName":"testReport"},{"_class":"hudson.maven.reporters.MavenAggregatedArtifactRecord"},{},{},{}],"artifacts":[],"building":false,"description":null,"displayName":"#1","duration":74099,"estimatedDuration":74099,"executor":null,"fullDisplayName":"helloCICD2 #1","id":"1","keepLog":false,"number":1,"queueId":47,"result":"SUCCESS","timestamp":1528443925590,"url":"http://192.168.33.16:8080/job/helloCICD2/1/","builtOn":"","changeSet":{"_class":"hudson.plugins.git.GitChangeSetList","items":[],"kind":"git"},"culprits":[],"mavenArtifacts":{},"mavenVersionUsed":"3.5.3"}







3. Get the console o/p of a job build. 

# curl -s -S -u lovedeepsh:b64f2444a08e4169cf8c844cfe568d82 http://192.168.33.16:8080/job/parameterized-hello-world/2/logText/progressiveText?start=0

Started by user LOVEDEEP SHARMA

Building in workspace /var/lib/jenkins/workspace/parameterized-hello-world

[parameterized-hello-world] $ /bin/sh -xe /tmp/jenkins3099275406497963907.sh

+ echo Hello world!

Hello world!

Triggering a new build of hello upstream

Finished: SUCCESS

4. Trigger a jenkins job build
 
curl -s -S -u lovedeepsh:b64f2444a08e4169cf8c844cfe568d82 -X POST http://192.168.33.16:8080/job/helloCICD2/build
