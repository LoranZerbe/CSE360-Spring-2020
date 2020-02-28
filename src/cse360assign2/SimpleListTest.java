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
     * This tests if the program removes elements correctly, 0 being an empty element
     */
    @Test
    public void testRemove() {
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
        test.remove(6);
        assertEquals("1 2 3 4 5 7 8 9 10 0 ", test.toString());
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
}