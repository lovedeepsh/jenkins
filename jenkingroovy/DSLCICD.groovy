mavenJob('helloCICD2') {
    jdk('Java8')
    scm {
      git {
        remote {
          url('https://github.com/lovedeepsh/ContinuousIntegration.git')
        }
        branch("*/master")
      }
    }
            goals('clean install')
            goals('findbugs:findbugs')
            goals('checkstyle:checkstyle')
            goals('cobertura:cobertura')
               rootPOM("Spring3HibernateApp/pom.xml")
               mavenInstallation('mvn3.5.3')

  
  postBuildSteps('SUCCESS') {
         publishOverSsh {
            server('192.168.33.16') {
                transferSet {
                    sourceFiles('Spring3HibernateApp/target/Spring3HibernateApp.war')
                    removePrefix('Spring3HibernateApp/target/')               
                }
            
               }
            }
	}
}
