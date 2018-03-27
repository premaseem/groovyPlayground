def closureMethod = { a,s,l ->
    println("say hello to closure $a,$s,$l")
}
//println (closureMethod.class)
//println closureMethod instanceof Closure

closureMethod(25,"male","usa")

list = [1,2,66,6,5,4,4,3]
// default it as iterator
list.each{
//    println it
}

// closure with custom name of object
list.each{num->
//    print num
}

def timesTen(num,clsr){
        clsr(num * 10)
}

timesTen(2,{println it})

//10.times {
//    print it
//}

import java.util.Random
Random ran = new Random()

3.times{
    println ran.nextInt()
}

def closureWithOneArg = { str -> str.toUpperCase() }
assert closureWithOneArg('groovy') == 'GROOVY'

def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
assert closureWithOneArgAndExplicitType('groovy') == 'GROOVY'

def closureWithTwoArgs = { a,b -> a+b }
assert closureWithTwoArgs(1,2) == 3

def closureWithTwoArgsAndExplicitTypes = { int a, int b -> a+b }
assert closureWithTwoArgsAndExplicitTypes(1,2) == 3

def closureWithTwoArgsAndOptionalTypes = { a, int b -> a+b }
assert closureWithTwoArgsAndOptionalTypes(1,2) == 3

def closureWithTwoArgAndDefaultValue = { int a, int b=2 -> a+b }
assert closureWithTwoArgAndDefaultValue(1) == 3

