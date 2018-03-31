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