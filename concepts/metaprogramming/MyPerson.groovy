package metaprogramming

import groovy.transform.Canonical
import groovy.transform.Sortable


@Canonical
@Sortable(includes = ['age'])
class MyPerson {
    String name
    Integer age
}

@Singleton
class Wife{

    def yellAtHusband(){
        "yelling"
    }
}
