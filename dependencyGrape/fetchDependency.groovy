/*
@author: Aseem Jain
*/

@Grapes(
    @Grab(group='org.apache.commons',module = 'commons-lang3', version = '3.4')
)
import org.apache.commons.lang3.text.WordUtils

String name = "prem aseem jain"
WordUtils wu = new WordUtils()
print wu.initials(name)