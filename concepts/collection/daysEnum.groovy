enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

Range day_range = Days.SUNDAY..Days.SATURDAY

for (day in day_range){
    println(day)
}

day_range.each { day ->
    println(day)
}
print day_range.contains(Days.SUNDAY)