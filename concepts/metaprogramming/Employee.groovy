package metaprogramming

/*
@author: Aseem Jain*/

class Employee {

    def prop1 = "Khan"

    @Override
    Object getProperty(String s) {

        if (metaClass.hasProperty(this,s))
            return metaClass.getProperty(this,s)
        else
            return "no property found you dumb"
    }

    @Override
    Object invokeMethod(String s, Object o) {
        return "Default handler $s "
    }
}

