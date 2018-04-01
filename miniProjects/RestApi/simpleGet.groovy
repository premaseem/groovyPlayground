package RestApi

//import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient
/*
@author: Aseem Jain
@title: simple get request from google
*/

// google weather api call

// https://mvnrepository.com/artifact/org.codehaus.groovy.modules.http-builder/http-builder
@Grapes(
        @Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
)

//def client = new RESTClient()
obj = "http://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22".toURL()
println obj.getText()