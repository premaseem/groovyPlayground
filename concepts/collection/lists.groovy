def days = ["SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"]
//println(days)

println(days.getAt(2))
days.pop()
days.push("FUNDAY")
days.putAt(2,"HOLIDAY")
days = days + [1,2,3]
days.remove("THURSDAY")
days << ["XDAY"]
print(days.flatten())
// Closure
//days.each{day->
//    println(day)
//}

//for (day in days){
//    println(day)
//}