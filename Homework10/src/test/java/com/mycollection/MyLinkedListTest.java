package com.mycollection;

import com.exception.NodeIndexOutBoundaryException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    private List <Long> linkedList;

    @Before
    public void setUp () {
        linkedList = new MyLinkedList <>();
        linkedList.add(10L);
        linkedList.add(20L);
        linkedList.add(30L);
    }

    @Test
    public void testAddElement () {
        linkedList.add(40L);
        assertEquals(10L, linkedList.get(0), 0.0);
        assertEquals(20L, linkedList.get(1), 0.0);
        assertEquals(30L, linkedList.get(2), 0.0);
        assertEquals(40L, linkedList.get(3), 0.0);
    }

    @Test
    public void testRemoveElement () {
        linkedList.remove(1);
        assertEquals(10L, linkedList.get(0), 0.0);
        assertEquals(30L, linkedList.get(1), 0.0);
    }

    @Test(expected = NodeIndexOutBoundaryException.class)
    public void testRemoveElementException () {
        linkedList.remove(10);
    }

    @Test
    public void testGetElement () {
        assertEquals(30L, linkedList.get(2), 0.0);
    }

    @Test
    public void testSizeList () {
        assertEquals(3, linkedList.size());
    }

    @Test(expected = NodeIndexOutBoundaryException.class)
    public void testGetElementException () {
        linkedList.get(7);
    }

    @Test
    public void testClearList () {
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }
}
