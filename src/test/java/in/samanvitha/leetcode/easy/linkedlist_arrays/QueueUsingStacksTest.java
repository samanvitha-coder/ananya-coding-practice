package in.samanvitha.leetcode.easy.linkedlist_arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueUsingStacksTest {

    @Test
    public void testCorrectOperation(){
        QueueUsingStacks stack = new QueueUsingStacks();
//        int result = qu.push(1);
//        Assertions.assertEquals(1,result);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(stack.empty(),false);
        Assertions.assertEquals(stack.top(),3);
        Assertions.assertEquals(stack.pop(),3);
        Assertions.assertEquals(stack.top(),2);
        Assertions.assertEquals(stack.pop(),2);
        Assertions.assertEquals(stack.top(),1);
        Assertions.assertEquals(stack.pop(),1);
        Assertions.assertEquals(stack.top(),-1);
        Assertions.assertEquals(stack.empty(),true);
    }


}