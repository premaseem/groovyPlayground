def num =69

switch (num){
    case 1:
        println("I am number 1")
        break
    case [3,69]:
        println("69 position")
        break
    case {num %2 == 0}:
        println("Even number")
        break
    default:
        println("catch all")
}