package in.samanvitha.udemy.course.Stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {
    @Test
    public void testCaseInput(){
        ArrayStack stack = new ArrayStack(10);

        Assertions.assertEquals(stack.isEmpty(),true);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        Assertions.assertEquals(stack.peek().getId(),78);

        Assertions.assertEquals(stack.pop().getId(),78);

        Assertions.assertEquals(stack.isEmpty(),false);

        Assertions.assertEquals(stack.peek().getId(),3245);

        Assertions.assertEquals(stack.size(),4);
    }
}
