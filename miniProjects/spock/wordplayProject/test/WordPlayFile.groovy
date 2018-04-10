package spock.wordplayProject.test

import spock.lang.Specification
import spock.lang.Unroll
import spock.wordplayProject.main.Wordplay
import spock.wordplayProject.main.WordplayImpl

/*
@author: Aseem Jain
*/
class WordplayTernaryTest extends Specification {

    final Wordplay wordplay = new WordplayImpl();

    def setup() {
       wordplay.reset()
   }

    //region Shorthand Ternary Expressions

    @Unroll
   def "should resolve shorthand ternary expression given variable: #var"() {
       given:
       String script = "It was a {weather_sunny ? sunny | rainy} day."

       when:
       wordplay.setVariable("weather_sunny", var);
       String output = wordplay.process(script)

       then:
       output.equals(result)

       where:
       result                | var
       "It was a sunny day." | true
       "It was a rainy day." | false
   }
   //endregion

 }