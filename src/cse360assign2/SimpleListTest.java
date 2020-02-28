package cse360assign2;

import org.junit.Test;
import static org.junit.Assert.*;

/** Loran Zerbe - 382 - Assignment #2
 *  This class tests the methods of SimpleList.
 */
public class SimpleListTest {
    @Test
    /**
     * This tests the constructor
     */
    public void testSimpleList() {
        SimpleList test = new SimpleList();
        assertNotNull(test);
        assertEquals(0, test.count());
    }

    /**
     * This tests if the program adds properly
     */
    @Test
    public void testAdd() {
        SimpleList test = new SimpleList();
        test.add(11);
        test.add(10);
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        assertEquals(11, test.count());
        assertEquals("1 2 3 4 5 6 7 8 9 10 11 0 0 0 0 ", test.toString());
    }

    /**
     * This tests if the program removes elements correctly, 0 being an empty element
     */
    @Test
    public void testRemove() {
        SimpleList test = new SimpleList();
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        test.remove(3);
        assertEquals("1 2 4 5 6 0 0 0 ", test.toString());
        assertEquals(5, test.count());
        test.remove(1);
        test.remove(2);
        test.remove(6);
        assertEquals(2, test.count());
        assertEquals("4 5 0 0 ", test.toString());
        test.remove(4);
        assertEquals("5 0 0 ", test.toString());
        test.remove(5);
        assertEquals("0 0 ", test.toString());
        test.add(1);
        assertEquals("1 0 ", test.toString());
    }

    /**
     * This tests the return of a new SimpleList()
     */
    @Test
    public void testCount() {
        SimpleList test = new SimpleList();
        assertEquals(0, test.count());
    }

    /**
     * This tests if the program returns the string properly
     */
    @Test
    public void testToString() {
        SimpleList test = new SimpleList();
        test.add(10);
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        assertEquals(10, test.count());
        assertEquals("1 2 3 4 5 6 7 8 9 10 ", test.toString());
    }

    /**
     * This tests if the program returns the correct index
     */
    @Test
    public void testSearch() {
        SimpleList test = new SimpleList();
        test.add(10);
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        assertEquals(2, test.search(3));
    }

    /**
     * This tests if the program appends an integer to the list properly
     */
    @Test
    public void testAppend() {
        SimpleList test = new SimpleList();
        test.add(10);
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        test.append(11);
        assertEquals("1 2 3 4 5 6 7 8 9 10 11 0 0 0 0 ", test.toString());
    }

    /**
     * This tests if the program returns the first element
     */
    @Test
    public void testFirst() {
        SimpleList test = new SimpleList();
        test.add(10);
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        assertEquals(1, test.first());
    }

    /**
     * This tests if the program returns the last element
     */
    @Test
    public void testLast() {
        SimpleList test = new SimpleList();
        test.add(10);
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        test.remove(1);
        assertEquals(10, test.last());
        test.remove(2);
        assertEquals(10, test.last());
    }

    /**
     * This tests if the program returns the array list size
     */
    @Test
    public void testSize() {
        SimpleList test = new SimpleList();
        test.add(10);
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        test.remove(1);
        test.remove(2);
        assertEquals(10, test.size());
        test.remove(3);
        assertEquals(8, test.size());
        test.remove(4);
        assertEquals(6, test.size());
        test.remove(5);
        assertEquals(6, test.size());
        test.remove(6);
        assertEquals(5, test.size());
        test.remove(7);
        assertEquals(4, test.size());
    }
}