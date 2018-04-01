package builders

import groovy.json.JsonBuilder

/*
@author: Aseem Jain
@title: Build books json using builder
*/


JsonBuilder jsonBuilder = new JsonBuilder()
jsonBuilder.books{
    currentBook{
        title ("Groovy in Action 2nd Edition")
        author "Dierk Koenig"
        price 50.58
    }
    nextBook{
        title ("Groovy in Action 2nd Edition")
        author "Dierk Koenig"
        price 50.58
    }
}

new File("books.json").write(jsonBuilder.toPrettyString())