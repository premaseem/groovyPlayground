package metaprogramming

/*
@author: Aseem Jain*/

class Employee {

    def prop1 = "Khan"

    @Override
    void setProperty(String key, Object value) {
        this.@"$key" = "khan sab"
    }

    @Override
    Object getProperty(String s) {

        if (metaClass.hasProperty(this,s))
            return metaClass.getProperty(this,s)
        else
            return "no property found you dumb"
    }

    @Override
    Object invokeMethod(String s, Object o) {
        println("method intercepter called ")
        return "Default handler $s "
    }

    def methodMissing(String name, def args){
        println("method missing called on $name")
    }

    def showSalary(){
        println("million dollar")
    }
}

