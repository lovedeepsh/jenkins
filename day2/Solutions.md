DAY 2 JENKINS

Assignment 1

Setup unix based authentication. 
Delegates the authentication to the underlying Unix operating system user database. With this setting, users will be logged into Jenkins by entering their Unix username and password. 
This mode will also allow you to use Unix groups for authorization. For example, you can say "everyone in the 'developers' group will have the administrator access". 
Unix allows an user and a group to have the same name. If you need to disambiguate, you can use the '@' prefix to force the name to be interpreted as a group. For example, '@dev' would mean the 'dev' group and not the 'dev' user, while 'dev' would be interpreted as an user if you indeed have the user of that name. 
This is done through a library called PAM, which defines its own configuration mechanism. It also works correctly with user database extensions like NIS. 
PAM - A pluggable authentication module (PAM) is a mechanism to integrate multiple low-level authentication schemes into a high-level application programming interface (API).
NIS - The Network Information Service, or NIS, is a client-server directory service protocol for distributing system configuration data such as user and host names between computers on a computer network. Sun Microsystems developed the NIS; the technology is licensed to virtually all other Unix vendors.
- Go to localhost:8080
- Click the Manage Jenkins
- Click configure global security
- Click Unix user/group database in Security Realm section.
- Keep this is mind that you jenkins user could read /etc/shadow
- Put the user jenkins in shadow group











Configure Matrix based authorization. 
- Go to localhost:8080
- Click the Manage Jenkins
- Click configure global security
- Click Matrix-Based security in the authorization section
- If you want to add any users then add them using “User/group add”  block.
- Click on the various checkboxes through which you want tp provide permissions to various users i.e. in the section of Overall, Credentials, Agent, Job, Run, View, SCM.
- I created 2 users i.e. anshulsh and ravish by clicking Manage User  in Manage Jenkins and then Create User  option.
  
Implement project based matrix based authorization.
- Create a project and divide the jobs as the role given i.e. developer, production etc on Jenkins
- Assign the roles to the various users
- Click on Manage Jenkins
- Click on Configure Global Security
- Click on Matrix-based Security
- Add user and provide them permisions according to the project.


Configure SSO using gmail based login. 

Setup a role based user authentication and autharization. 
- Go to Manage Jenkins
- Click Manage Plug-ins
- Click on Available
- Download Role-based Strategy Plugin
- Now Go to configure Global Security
- Click on Role based Strategy in Authorization Section and click save
- Now you will see a Manage and assign roles section.
- Go inside that and click Manage roles
- Define and Add the roles here.
- Go back and click Assign roles and assign the roles to the users.










Assignment 2
Setup email notification for each job failure only. 
- Click on Manage Jenkins.
- Click on Configur System.
- Go to the last section.
- Set SMTP in the email-notification section.
- set SMTP server as “smtp.gmail.com”
- Click on Advance
- Click on use SMTP authentication checkbox
- Provide user name as your email ID and also provide password.
- click use ssl checkbox
- Give SMTP port as 465
NOW,
- Create a new project.
- Click on configuration.
- At the end, Click on Post Build Option adn select E-mail notification
- Give the recipients ID
- Click the checkbox for Send e-mail for every unstable build
- You can also test it by sending a test email.
- Check you maild ID.

Send jenkins console logs in mail not as attachement but as plain text. 
- Create a new project
- Click on configuration
- At the end, Click on Post Build option and select Editable email notification
- Go down and select Content type as both HTML and Plain Text.
- Click attach build log and select Compress and Attach build log.
- Save the settings
- Create a project and build it.
- Check the email-notification for the build console.

Enable slack integration for jenkins jobs build notifications. 
- Click on Manage Jenkins
- Click on Manage Plug-ins
- Click on available
- Search for app “slack notification” and download it.
- Click on Manage Jenkins and click Configure system
- Ignore slack webooks settings
- Go to Global slack notifier settings
- Now open slack and create a new channel “slack-jenkins”
- Click on the settings of the channel
- Click add apps and slack page will be open on web browser.
- Create a token, base url.
- Fill these details in jenkins Global slack notifier settings
- Click on test and see if you got any message on slack.


Assignment3:
Add a slave to your jenkins, restrict some of the job to your slave. 
- Click on Manage jenkins and then click Manage nodes
- Check on the left side and click New Nodes.
- Give the name to node “slave” and click the checkbox for Permanent agent and click ok
- Fill the details i.e. Name, Description, executors (as you want to give)
- Give the remote root directory address of you slave machine
- Give the labels and select the usage as Only buildjobs with labels expressions matching this node.
- Click on save
