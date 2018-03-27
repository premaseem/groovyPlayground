def myMethod(Closure c){
    c()
}

def c = {
    print("declared closure ")
}

myMethod({
    println("closure called")
})

map = ["name":"Aseem",sex:"Indian",age:34]
map.each {k,v->
    println k
    println v
}

def greet = {p1,p2->
    println("$p1, $p2")
}

greet("Hello","Aseem")

helloGreet= greet.rcurry("Hello")

helloGreet("Aseem")

