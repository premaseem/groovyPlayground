package spock.TDDspock

import spock.lang.Specification

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

class StubTests extends Specification{


    def "should return 2 for method parameter equal to 2"() {
        given:
        List list = Stub()
        list.get(0) >> 0
        list.get(1) >> { throw new IllegalArgumentException() }
        list.get(2) >> 2

        expect:
        list.get(2) == 2
    }


}
