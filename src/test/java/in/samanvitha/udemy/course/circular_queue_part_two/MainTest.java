package in.samanvitha.udemy.course.circular_queue_part_two;

import in.samanvitha.udemy.course.queues_using_arrays.ArrayQueue;
import in.samanvitha.udemy.course.queues_using_arrays.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCaseInput() {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

     ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        Assertions.assertEquals(queue.peek().getId(),123);
        Assertions.assertEquals(queue.remove().getId(),123);
        Assertions.assertEquals(queue.peek().getId(),4567);
        Assertions.assertEquals(queue.size(),4);
    }


}