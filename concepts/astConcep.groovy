import groovy.transform.Immutable
import groovy.transform.ToString


@ToString
@Immutable
class PersonClass {
    String first
    String last
    Integer age
//    private PersonClass(String first,String last){
//        this.first = first
//        this.last = last
//
//    }
}
p =new PersonClass(first="aseem",last ="Jain",21)
print p