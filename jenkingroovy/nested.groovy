job('ninja-jobs') {
  nestedView('simple-jobs') {
    views {
      listView('simple-jobs') {
        jobs {
        names('parameterized-hello-world', 'hello person', 'hello git', 'hello periodical', 'hello poll')
        }
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
        
  
      nestedView('complex-jobs') {
    views {
        listView('complex-jobs') {
          jobs {
          names('hello upstream', 'hello downstream')
          }
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
