package spock.TDDspock

import spock.lang.Specification
import spock.lang.Unroll

/*
@author: Aseem Jain
*/

class MockTests extends Specification{

    @Unroll
    def "mock payment gateway"(){

        given:
        PaymentGateway paymentGateway = Mock()
        paymentGateway.pay(20) >> true
        paymentGateway.pay(10) >> false

        when:
        def result1 = paymentGateway.pay(20)
        def result2 = paymentGateway.pay(10)


        then:
        result1 == true
        result2 == false

    }

}


// Source code for testing

interface PaymentGateway {
    boolean pay(int i)
}

