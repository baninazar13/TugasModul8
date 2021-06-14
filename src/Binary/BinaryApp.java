
package Binary;

public class BinaryApp {
    
        public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        BinaryNode siNode;
        
        siNode = new BinaryNode('D');
        tree.insert(siNode);
        
        siNode = new BinaryNode('B');
        tree.insert(siNode);
        
        siNode = new BinaryNode('A');
        tree.insert(siNode);
        
        siNode = new BinaryNode('C');
        tree.insert(siNode);
        
        siNode = new BinaryNode('F');
        tree.insert(siNode);
        
        siNode = new BinaryNode('E');
        tree.insert(siNode);
        
        siNode = new BinaryNode('G');
        tree.insert(siNode);
        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
    }
}
