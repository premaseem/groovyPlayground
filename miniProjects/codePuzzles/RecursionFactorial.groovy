package codePuzzles

/*
@author: Aseem Jain
*/

// Factorial using recursion

    int factorial(int num){
        if (num <=1){
            print num
            return 1
        }
        print num + " X "
        return num * factorial(num-1)
    }

//factorial(3) == 6
//factorial(4) == 24
factorial(5) == 120



