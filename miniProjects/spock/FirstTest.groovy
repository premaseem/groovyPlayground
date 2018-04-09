package spock

/*
@author: Aseem Jain

*/

@Grapes(
        @Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')
)

import spock.lang.*


class FirstTest1{
    def abc;
}



def person = new FirstTest1()

println(person)