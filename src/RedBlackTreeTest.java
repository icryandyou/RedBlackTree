

import static org.junit.Assert.*;
import org.junit.Test;


public class RedBlackTreeTest {
    
    @Test
    public void testInsert() {
        RedBlackTree rb1 = new RedBlackTree();
        RedBlackTree rb2 = new RedBlackTree();
     	int[] array = {1, 2, 678,9, 11, 655, 655, 45, 0, 4,  7, 5, 6, 656,11,34,2,456};
    	Node node1 = null;
    	
        for (int i : array) {
        	node1 = rb1.insert(i);
        }
        
        rb1.getMaximum(node1);
        rb1.getMaximum();
        rb1.getMinimum(node1);
        rb1.getMinimum();
        

        assertTrue(rb1.contains(0));
        
        rb1.delete(node1);
        
        rb1.delete(0);
        rb1.delete(455);
        rb1.delete(null);
        rb1.delete(1234);
        
        try {
        	rb1.delete(999);
        } catch (Exception e) {}
        
        try {
        	rb1.delete(null);
        } catch (Exception e) {}
        
        rb1.delete(0);
        
        assertEquals(16, rb1.getSize());
        assertEquals(2, rb1.getSuccessor(0));
        //assertEquals(2, rb2.getSuccessor(0));
        
        rb1.equals(node1);
        rb1.equals(rb1);
        rb1.equals("1");
        rb1.equals(new RedBlackTree());
        
        rb1.hashCode();
        rb1.printSubtree(node1);
        rb1.printTree();
        rb1.printTreeInOrder();
        rb1.printTreePostOrder();
        rb1.printTreePreOrder();
        try {
        	rb1.wait(50, 100);
        } catch (Exception e){}
        
        Node node2 = new Node(1, null, null, null);
        assertEquals(Integer.valueOf(1), node2.value);
        assertEquals(null, node2.left);
        assertEquals(null, node2.right);
        assertTrue(node2.isLeaf());
        assertEquals(32, node2.hashCode());
        assertTrue(node2.equals(node2));
        assertFalse(node2.equals(node1));
        assertFalse(node2.equals(null));
        
        Node node3 = new Node(null, node2, null, null);
        assertFalse(node2.equals(node3));
        assertFalse(node3.equals(node2));
        
        for (int num : array) {
        	node1 = rb1.insert(num);

        }
        
    }

}
