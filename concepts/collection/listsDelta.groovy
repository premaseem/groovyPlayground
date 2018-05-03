package collection

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

def collection1 = ["test", "a","d"]
def collection2 = ["a","test"]
def commons = collection1.intersect(collection2)


def difference = collection1.plus(collection2)
difference.removeAll(commons)
assert [] == difference