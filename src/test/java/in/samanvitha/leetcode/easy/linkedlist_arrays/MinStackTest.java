package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    @Test
    public void testCaseCorrectOperations(){
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(3);
        stack.push(-1);
        stack.push(4);
        Assertions.assertEquals(stack.top(),4);
        stack.pop();
        Assertions.assertEquals(stack.top(),-1);
        Assertions.assertEquals(stack.getMin(),-2);
    }

}