package fileIO

String team
println("enter name: ")
System.in.withReader { input ->
    team = input.readLine()
}

println("input team is $team")

new File("userInput.txt").text = team