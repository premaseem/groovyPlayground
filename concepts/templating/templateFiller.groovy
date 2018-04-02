package templating

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

/*
@author: Aseem Jain
*/

// template engine
// insert file
// Data binding
// generate final result

SimpleTemplateEngine engine = new SimpleTemplateEngine(true)
Template template = engine.createTemplate(new File('emailTemplate.txt'))

def dataList = [[fname : "Aseem Jain",
                 orders: [
                         [name: "item1", price: 23],
                         [name: "item2", price: 233],
                         [name: "item3", price: 235]
                 ]],
                [fname : "Meera Jain",
                 orders: [
                         [name: "item11", price: 23],
                         [name: "item21", price: 233],
                         [name: "item31", price: 235]
                 ]]]
for (data in dataList) {
    println template.make(data)
}



