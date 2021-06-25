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
