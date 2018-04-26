package spock.TDDspock

import spock.lang.Specification
import spock.lang.Unroll

/*
@author: Aseem Jain
*/

class MockTests extends Specification {

    @Unroll
    def "mock payment gateway"() {

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

    def "verify that method is invoked"(){

        given:
        PaymentGateway paymentGateway = Mock(PaymentGateway)
        Card c = Mock (Card)

        when:
        paymentGateway.callVisa()
        paymentGateway.pay(2)

        c.main()

        then:
        1 * paymentGateway.pay(2)
        1 * paymentGateway.callVisa()
        1 * c.main()
    }

}



// Source code for testing

trait PaymentGateway {
    boolean pay(int i){
        callVisa()
    }

    void callVisa(){
        println "visa called"
    }
}

trait Card {
    void main(){
        println "visa called"
    }
}
