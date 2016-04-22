import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class Example {
   static void main(String[] args) {
      def jsonSlurper = new JsonSlurper()
      def object = jsonSlurper.parseText('{ "name": "premaseem", "ID" : "1"}')

      println(object.name);println(object.ID)


      def output = JsonOutput.toJson([ new Student(name: 'John',ID:1),
         new Student(name: 'Mark',ID:2)]);
      println(output)
   }
}


class Student {
   String name
   int ID;
}
