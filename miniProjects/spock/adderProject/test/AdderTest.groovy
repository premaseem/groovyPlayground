package spock.adderProject.test

import spock.adderProject.main.Adder
import spock.lang.Specification

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

class AdderTest extends Specification{

    def "adder test with 2 integer values"(){

        given: "a new adder class is created"
        def adder = new Adder()

        expect: "Adds and return sums"
        adder.add(3,4) == 7

    }

}
