package builders

import groovy.json.JsonBuilder
import groovy.xml.MarkupBuilder

/*
@author: Aseem Jain
@title: xml builder
*/

MarkupBuilder builder = new MarkupBuilder()
builder.books{
    book(isbn:"978-1935182443"){
        title ("Groovy in Action 2nd Edition")
        author "Dierk Koenig"
        price 50.58
    }
    book(isbn:"978-1935182443"){
        title "Groovy in Action 2nd Edition"
        author "Dierk Koenig"
        price 50.58
    }
}
