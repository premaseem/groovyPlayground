package codePuzzles

/*
@author: Aseem Jain
*/

// Question : Count how many times a letter / character is repeated in a word -
// input: "Rackspace"
// output: "R-1, a- 2

testfindOccurance()

String findOccurance(String word){

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

    StringBuffer sb = new StringBuffer()
    for (Character  c : wordMap.keySet()) {
        sb.append( ""+ c +"-"+wordMap.get(c) + " ")
    }
    println "Word ${word} has occurances of word => " + sb.toString()
    return sb.toString()
}

void testfindOccurance(){
    assert "p-1 a-2 R-1 c-2 s-1 e-1 k-1".equals(findOccurance("Rackspace").trim())
    assert "a-3 m-1".equals(findOccurance("aama").trim())
}
