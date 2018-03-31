package metaprogramming

/*
@author: Aseem Jain
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

// Sorting
MyPerson p3 = new MyPerson(name:"aseem",age:46)
MyPerson p4 = new MyPerson(name:"waseem",age:66)
MyPerson p5 = new MyPerson(name:"qaseem",age:86)
MyPerson p6 = new MyPerson(name:"zaseem",age:6)

def list = [p1,p6,p3,p4,p5,p2]
println( list.toSorted())
println(list)

