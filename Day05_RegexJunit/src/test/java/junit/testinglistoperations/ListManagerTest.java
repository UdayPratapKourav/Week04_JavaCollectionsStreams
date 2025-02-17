package junit.testinglistoperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {
    private ListManager listManager;
    private List<Integer> testList;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        testList = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(testList, 10);
        listManager.addElement(testList, 20);
        assertEquals(2, testList.size());
        assertTrue(testList.contains(10));
        assertTrue(testList.contains(20));
    }

    @Test
    void testRemoveElement() {
        testList.add(10);
        testList.add(20);
        listManager.removeElement(testList, 10);
        assertEquals(1, testList.size());
        assertFalse(testList.contains(10));
    }

    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(testList));
        testList.add(5);
        testList.add(15);
        assertEquals(2, listManager.getSize(testList));
    }

    @Test
    void testRemoveElementNotInList() {
        testList.add(10);
        listManager.removeElement(testList, 5);
        assertEquals(1, testList.size()); // List should remain unchanged
    }

    @Test
    void testNullListOperations() {
        listManager.addElement(null, 10);
        listManager.removeElement(null, 10);
        assertEquals(0, listManager.getSize(null)); // Null list should return size 0
    }
}
