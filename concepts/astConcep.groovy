import groovy.transform.Immutable
import groovy.transform.ToString


@ToString
@Immutable
class Person{
    String first
    String last
    Integer age
//    private Person(String first,String last){
//        this.first = first
//        this.last = last
//
//    }
}
p =new Person(first="aseem",last ="Jain",21)
print p