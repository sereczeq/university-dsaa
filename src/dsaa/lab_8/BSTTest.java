package dsaa.lab_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {
    BST<Link> bst;

    @BeforeEach
    void beforeEach() {
        bst = new BST<Link>();
    }

    @Test
    void getElement() {
    }

    @Test
    void successor() {
    }

    @Test
    void inOrderWalk() {
        BST<Integer> tree = new BST<Integer>();

        tree.add(7);
        tree.add(5);
        tree.add(2);
        tree.add(10);
        tree.add(12);

        IntegerToStringExec exec=new IntegerToStringExec();
        tree.inOrderWalk(exec);

        assertEquals(exec.getResult(), "2; 5; 7; 10; 12");
    }

    @Test
    void toStringInOrder() {
    }

    @Test
    void preOrderWalk() {
        BST<Integer> tree = new BST<Integer>();

        tree.add(7);
        tree.add(5);
        tree.add(2);
        tree.add(10);
        tree.add(12);

        IntegerToStringExec exec=new IntegerToStringExec();
        tree.preOrderWalk(exec);

        assertEquals(exec.getResult(), "7; 5; 2; 10; 12");
    }

    @Test
    void toStringPreOrder() {
    }

    @Test
    void postOrderWalk() {
        BST<Integer> tree = new BST<Integer>();

        tree.add(7);
        tree.add(5);
        tree.add(2);
        tree.add(10);
        tree.add(12);

        IntegerToStringExec exec=new IntegerToStringExec();
        tree.postOrderWalk(exec);

        assertEquals(exec.getResult(), "2; 5; 12; 10; 7");
    }

    @Test
    void toStringPostOrder() {
    }

    @Test
    void add() {
        BST<Integer> tree = new BST<Integer>();

        assertTrue(tree.add(7));
        assertFalse(tree.add(7));
        assertTrue(tree.add(5));
        assertTrue(tree.add(2));
        assertTrue(tree.add(10));
        assertTrue(tree.add(12));

        assertFalse(tree.add(7));
        assertFalse(tree.add(10));
        assertFalse(tree.add(12));
        assertFalse(tree.add(12));
        assertFalse(tree.add(12));
    }

    @Test
    void remove() {
        BST<Integer> tree = new BST<Integer>();

        assertEquals(tree.remove(7), null);

        assertTrue(tree.add(7));
        assertFalse(tree.add(7));

        assertEquals(tree.remove(7), 7);
        assertTrue(tree.add(7));

        assertTrue(tree.add(10));
        assertTrue(tree.add(11));
        assertTrue(tree.add(12));
        assertTrue(tree.add(13));
        assertTrue(tree.add(14));
        assertTrue(tree.add(15));
        assertTrue(tree.add(16));
        assertTrue(tree.add(17));

        assertEquals(tree.remove(10), 10);
        assertEquals(tree.remove(17), 17);

        assertNull(tree.remove(1000000));
    }

    @Test
    void clear() {
    }

    @Test
    void size() {
    }
}