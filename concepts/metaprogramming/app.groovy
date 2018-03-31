package metaprogramming

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

Employee emp = new Employee()
emp.showSalary()
emp.someMethod()
println emp.prop1
//emp.prop2 = "premaseem"
println emp.prop2

MyPerson p1 = new MyPerson(name:"aseem",age:36)
MyPerson p2 = new MyPerson(name:"aseem",age:36)
assert p1.equals(p2)
assert p1 == p2
assert p1.hashCode() == p2.hashCode()
