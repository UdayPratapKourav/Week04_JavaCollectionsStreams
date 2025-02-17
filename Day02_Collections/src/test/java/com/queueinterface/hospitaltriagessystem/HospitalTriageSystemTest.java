package com.queueinterface.hospitaltriagessystem;



import com.queueinterface.hospitaltriagesystem.Patient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

public class HospitalTriageSystemTest {



    @Test
    public void testTriageOrder() {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Patient("Uday", 5));
        priorityQueue.add(new Patient("Adarsh", 6));
        priorityQueue.add(new Patient("Sanket", 2));

        List<String> expectedOrder = List.of("Adarsh", "Uday", "Sanket");
        List<String> actualOrder = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            actualOrder.add(priorityQueue.poll().getName());
        }

        assertEquals(expectedOrder, actualOrder);
    }

    @Test
    public void testSinglePatient() {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Patient("Rahul", 4));

        assertEquals("Rahul", priorityQueue.poll().getName());
    }

    @Test
    public void testEmptyQueue() {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        assertNull(priorityQueue.poll()); // Should return null if empty
    }
}
