package codePuzzles

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
*/

// Question : Count how many times a letter / character is repeated in a word -
// input: "Rackspace"
// output: "R-1, a- 2


printOccurance("Rackspace")

void printOccurance(String word){

    def wordArray = word.toCharArray()
    Map<Character,Integer> wordMap = new HashMap<>();


    for (Character letter in wordArray){
        if (wordMap.get(letter) == null){
            wordMap.put(letter,1)
        }else{
            def num = wordMap.get(letter) + 1
            wordMap.put(letter,num)
        }

    }

    for (Character  c : wordMap.keySet()) {
        print ""+ c +"-"+wordMap.get(c) + " "
    }

}

