package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingStackTest {
    @Test
    public void testCaseCorrectOperations(){
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        Assertions.assertEquals(queue.peek(),1);
        Assertions.assertEquals(queue.pop(),1);
        Assertions.assertEquals(queue.empty(),false);
    }

}