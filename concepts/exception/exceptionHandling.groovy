/*
@author: Aseem Jain
*/

def throwMe() {
    // do something
    throw new NullPointerException("Bogus exception")
}

def log =[]
try {
    throwMe()
}catch (NullPointerException npe){
  log << npe.message
}catch (Exception | FileNotFoundException e){
    log << e.message
}finally{
    log << "finally repaired"
}

println log