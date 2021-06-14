
package Binary;

public class BinaryNode {
    
     /*
    a) b merupakan predesor dari c dan d
    b) c dan d merupakan succesor dari b
    c) a dan b merupakan ancestor dari d atau c
    d) d dan b merupakan descendent dari a
    e) b merupakan parent dari d
    f) d merupakan child dari b
    g) c dan d adalah sibling
    h) subtree b,c,d dan subtree e,f,g
    */
    char data;
    BinaryNode left;
    BinaryNode right;
    public BinaryNode(char data){
        this.data = data;
    }

}
