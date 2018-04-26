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

    }


    def "should be able to remove from list"(){

        given:
        def list = [1,2,3]

        when:
        list.remove(0)

        then:
        list == [2,3]

    }

    def "test exception"(){
        given:
        def list = [1,2,3]

        when:
        list.remove(20)

        then:
        thrown(IndexOutOfBoundsException)
    }

}
