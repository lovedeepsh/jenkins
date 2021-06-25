job('Active-choice') {
    parameters {
        activeChoiceParam('simple-jobs') {
            description('"parameterized-hello-world", "hello person", "hello git", "hello periodical", "hello poll"')
            filterable()
            choiceType('SINGLE_SELECT')
        }
        activeChoiceParam('complex-jobs') {
            description('"parameterized-hello-world", "hello person", "hello git", "hello periodical", "hello poll"')
            filterable()
            choiceType('SINGLE_SELECT')
        }
            groovyScript {
                script('["simple-jobs", "complex-jobs"]')
                fallbackScript('"fallback choice"')
            }
        }
}
