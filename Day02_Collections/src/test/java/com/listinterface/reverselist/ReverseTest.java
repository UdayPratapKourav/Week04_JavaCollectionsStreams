package com.listinterface.reverselist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

        // Method for reversing the ArrayList
        public List<Integer> reverseList(List<Integer> list) {
            int left = 0;
            int end = list.size() - 1;
            while (left < end) {
                int temp = list.get(left);
                list.set(left, list.get(end));
                list.set(end, temp);
                left++;
                end--;
            }
            return list;
        }

        // Method for reversing the LinkedList
        public List<Integer> reverseLinkedList(List<Integer> linkedList) {
            int left = 0;
            int end = linkedList.size() - 1;
            while (left < end) {
                int temp = linkedList.get(left);
                linkedList.set(left, linkedList.get(end));
                linkedList.set(end, temp);
                left++;
                end--;
            }
            return linkedList;
        }

        @Test
        public void testReverseList() {
            List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            List<Integer> expectedList = Arrays.asList(5, 4, 3, 2, 1);

            List<Integer> actualList = reverseList(inputList);

            assertEquals(expectedList, actualList);
        }

        @Test
        public void testReverseLinkedList() {
            List<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
            List<Integer> expectedList = Arrays.asList(50, 40, 30, 20, 10);

            List<Integer> actualList = reverseLinkedList(linkedList);

            assertEquals(expectedList, actualList);
        }
}
