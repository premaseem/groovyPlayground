package spock.TDDspock

import spock.lang.Specification

/*
@author: Aseem Jain
*/

class FirstSpecification extends Specification{

    def "one plus one should be two"(){

        given:
        int num1 = 1
        int num2 = 2

        when:
        int result = num1 + num2

        then:
        result == 3

//        expect:
//        result == 3
    }


}
