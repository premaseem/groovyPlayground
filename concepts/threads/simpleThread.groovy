package threads

Thread t = new Thread(){
    String str = "aseem"
    def printit(){
        println(1..10)
    }

}
t.start()
t.printit()
println t.str

