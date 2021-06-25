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
