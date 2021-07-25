package in.samanvitha.udemy.course.single_linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void testCaseInput(){
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        EmployeeLinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),3245);
        Assertions.assertEquals(iterator.next(),22);
        Assertions.assertEquals(iterator.next(),4567);
        Assertions.assertEquals(iterator.next(),123);
        Assertions.assertEquals(iterator.hasNext(),false);
    }


}