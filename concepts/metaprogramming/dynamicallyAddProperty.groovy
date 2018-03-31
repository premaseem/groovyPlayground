package metaprogramming

/*
@author: Aseem Jain
*/

// Expando is expanded object which allows dynamically adding prop and method
Expando e = new Expando()
e.prop1 = "prem"
e.someMethod = { -> "some method called"}

assert e.prop1 == "prem"
assert e.someMethod() == "some method called"

class Dev {

}

// props and methods can be added dynamically using meta class on groovy
Dev d = new Dev()
d.metaClass.prop1 = "prem"
d.metaClass.someMethod = { -> "some method called" }
assert d.someMethod() == "some method called"
assert d.prop1 == "prem"