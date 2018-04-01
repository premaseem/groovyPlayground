package metaprogramming

import groovy.transform.AutoClone
import groovy.transform.Canonical
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.Immutable
import groovy.transform.TypeChecked


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

@Immutable
@ToString
class Virus{
    String type = "harmful"
    def spread(){

    }
}

@TypeChecked
@AutoClone
class StaticClass{
    String name
    Integer age

    void doPrint(){
        "$name $age"
//        "$name $Age"
    }
}