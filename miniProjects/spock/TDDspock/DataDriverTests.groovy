package spock.TDDspock

import spock.lang.Specification

/*
@author: Aseem Jain
Using Datatables in Spock
One easy win for Spock when compared to JUnit is how it cleanly it implements parameterized tests.
Again, in Spock, this is known as Data Driven Testing.
Now, let’s implement the same test again, only this time we’ll use Spock with Data Tables,
which provides a far more convenient way of performing a parameterized test:
*/

class DataDriverTests extends Specification{

    def "test power of 2"(int num,int power, int answer){

        expect:
        Math.pow(num,power) == answer


        //expressive Data table containing all our parameters.
        where:
        num | power | answer
        2|2|4
        3|2|9
        3|3|27
        4|2|16


    }

}
