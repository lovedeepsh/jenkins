DAY 3 JENKINS

Assignment 1

Pre requisite
Install below plugins 
Maven integration plugin 
Checkstyle Plug-in 
FindBugs Plug-in 
Static Analysis Collector Plug-in 
Cobertura Plugin

Pre requisites are being installed.

Maven Integration Plugin - Allow the selection of a Maven installation configured on the Global Jenkins configuration or on the Global Tool Configuration page if using Jenkins > 2.0. When auto-install is enabled, maven will be downloaded and made available for the pipeline job.

Checkstyle plugin - This plug-in is supported by the Static Analysis Collector plug-in that collects different analysis results and shows the results in aggregated trend graphs. Additionally, health reporting and build stability is also based on the aggregated results.

Findbugs plugin - The FindBugs plug-in scans for findbugs.xml files in the build workspace and reports the number of warnings found. This plug-in is part of the suite of static code analysis plug-ins.

Static Analysis Collector plugin -  A static analysis tool reviews program code, searching for application coding flaws, back doors or other malicious code.

Cobertura plugin - This plugin allows you to capture code coverage report from Cobertura. Jenkins will generate the trend report of coverage.
 

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/plug-ins%20download.png)






Assignment 2

Install below softwares under Global tool configuration 
Maven | Maven 3.5.2

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/mvn3.5.2.png)


Assignment 3

Java | You need Oracle account for same | JDK 8u162




Assignment 4

Git | You need to manually install git first
apt-get -y install git

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/gitinsjen.png)



Assignment 5

Setup CodeStability Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile as target
 
![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codestability2.png)

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codestability1.png)




Assignment 6

Setup static code analysis Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile findbugs:findbugs checkstyle:checkstyle as target 

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/staticcodeanalysis.png)

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/staticcodeanalysis2.png)





Assignment 7

Setup code coverage Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile cobertura:cobertura as target 

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codecoverage.png)

![Job DSL Plugin](https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codecoverage2.png)

