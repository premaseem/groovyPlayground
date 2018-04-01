package fileIO

// creating a file, no need to open close and catch exception
File file = new File("testFile.txt")

// writing to a file
file.write("Premaseem is a good boy \n")

// appending to a file
file.append("Added next line in the file\n")

// Reading from file
List list = file.readLines()
list.each { line ->
    println(line)
}

// List all files in current dir
File dir = new File(".")
dir.eachFile{ dirObj->
    if (dirObj.isFile()){
        println dirObj.name
    }
}