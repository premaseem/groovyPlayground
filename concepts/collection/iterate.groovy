num = [1,2,3]

println  12 in num

for( String s in 'a'..'z'){

    if (s in ['a','b']){
        continue
    }

    if (s == 's'){
        break
    }
    println(s)
}

for (Integer o in num){
    println(o)
}

num.each{println(it)}

while(num){
    num.remove(0)
}
assert !num