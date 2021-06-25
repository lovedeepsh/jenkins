DAY 4 JENKINS

Assignment 1

Install Nginx 

# sudo apt-get install nginx

# sudo systemctl status nginx

1. Install below listed plugins 

1. SSH plugin 

2. Git plugin 

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day4%20images/sshplugin.png)
 


Assignment2

1. Enable password less login between jenkins & root user 

# sudo su jenkins

# cd /var/lib/

# mkdir .ssh

# cd .ssh

# ssh-keygen -t rsa

# cat id_rsa.pub

( copy the public key and paste it to root .ssh directory)

# sudo su root

# cd .ssh

# sudo vim authorised_keys

# sudo vim /etc/ssh/ssh_config

( Uncomment Strictly host checking and add no )


2. Check Global configuration and provide SSH remote host(root) details

Provided the private key of jenkins user so that the public key which is being saved in root user can be accessed.






 
Assignment3

1. Create a tag creator Jenkins Job 

2. Job will create tag on your forked repo. 

3. Job should accept 2 parameters 

1. SRC_BRANCH 

2. TAG_NAME 

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day4%20images/tagcreator.png)



Assignment4

1. Sync your forked jenkins repo with https://github.com/ot-training/jenkins.git (using multiple remote).

# cd /var/lib/jenkins/workspace/TagCreator/

# sudo git remote add upstream https://github.com/lovedeepsh/jenkins-1.git

# sudo git fetch upstream

2. Create a Deployer Jenkins Job(static-code-deployment). 

3. It will checkout code from https://github.com//jenkins.git (your forked repo). 

4. Job will require a parameter TAG_NAME 

5. It will use SSH Publish plugin to publish files from jenkins server to target server 

6. Deploy index.html (existed inside attendees/assignments/day7) into nginx doc root. 

7. Update index.html (with your name) and create a new tag. 

8. Deploy with new tag. 

- Created new job “Deploy”

- Also installed Publish over ssh plugin

- Gave the string parameter for tag

- Provided the git repository in source code management

- Selected the post build option for “Send build artifacts over ssh”

- Go tot manage jenkins and configure system. At the end, provide the details for the ssh server.

- Now you can select the sever in post build – send build artifacts over ssh

- Provided the tranfer details for index.html

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day4%20images/deploy.png)


![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day4%20images/deploy2.png)
 


Assignment5

1. Install tomcat7

2. Install mysql

3. Fork ContinuousIntegration from opstree account.

4. Create a job Spring3HibernateApp-deployment

1. This job will be copy of static-code-deployment 

2. Update deploymnet target to tomcat webapps directory 

3. This job and code-stability (job from 6th day assignmnet) will have common workspace. 

5. Deploy Spring3HibernateApp.war into tomcat7 (pick from workspace, copy into webapp of tomcat)

6. Verify you can acecess http://:8080/Spring3HibernateApp/

- Installed tomcat8

- Installed mysql

- Forked ContinousIntegration

- Gave the forked git link in git

- Gave pom.xml adress for maven

- Gave clean install in goal

- Gave postbuild option for publish over ssh

- Gave command

cp /var/lib/jenkins/workspace/Spring3HibernateApp/Spring3HibernateApp/target/Spring3HibernateApp.war /var/lib/tomcat8/webapps/

- Build the job

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day4%20images/tomcatSpring.png)
 

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day4%20images/tomcatSpring2.png)



Assignment6
1. Configure nginx in a way so that it can serve 
1. static file (index.html) at http:// 
2. java application (Spring3HibernateApp) at http:///Spring3HibernateApp/
Hint: Add another location (Spring3HibernateApp/) and proxy_pass details in your nginx configireation. 

Assignment7 
1. Deploy a demo node application 
1. Fork node-js-sample repo into your account 
2. Create a jenkins job to build node code and create a tar file(artifact) 
3. Stop already application, Deploy tar file on a target server and start application again. Hint: Use pm2 to start and stop node process (process management) 
