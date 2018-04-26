package spock.TDDspock

import spock.lang.Specification

/*
@author: Aseem Jain
*/

class SpyTests extends Specification {


    def "should call save method once and print text to console"() {
        given:
        Transaction transaction = Stub(Transaction)
        UserService service = Spy(UserServiceImpl, constructorArgs: [transaction])

        when:
        service.save(new User(name: 'Katherine'))

        then:
        1 * service(_)
    }


}



interface Transaction { }

class User{
    def name = "user"
}

interface UserService {
    boolean isServiceUp()
    void save(User user)
}

class UserServiceImpl implements UserService {

    UserServiceImpl(Transaction transaction) { }

    @Override
    boolean isServiceUp() {
        return false
    }

    @Override
    void save(User user) {
        println "Saving user ${user.name} - UserServiceImpl"
    }
}