List people = [
        [name:'Jane',city:"New York City"],
        [name:'John',city:"Cleveland"],
        [name:'Mary',city:"New York City"],
        [name:'Dan',city:"Cleveland"],
        [name:'Tom',city:"New York City"],
        [name:'Frank',city:"New York City"],
        [name:'Jason',city:"Cleveland"]
]

//result = people.findAll({ p->
//    p.city == "New York City"
//})

result = people.groupBy {p->
    p.city
}

println result["New York City"].each{o->println o.name}