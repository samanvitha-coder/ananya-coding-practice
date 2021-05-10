package in.samanvitha.simple_interpreter_part_two.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ExprTest {

    @Test
    public void testCaseEvalPlus(){
        Expr expr = new Expr();
        int result = expr.evaluate("10+10");
        Assertions.assertEquals(20,result);
    }

    @Test
    public void testCaseEvalMinus(){
        Expr expr = new Expr();
        int result = expr.evaluate("20-10");
        Assertions.assertEquals(10,result);
    }

    @Test
    public void testCaseEvalMultiply(){
        Expr expr = new Expr();
        int result = expr.evaluate("10*10");
        Assertions.assertEquals(100,result);
    }

    @Test
    public void testCaseEvalDivide(){
        Expr expr = new Expr();
        int result = expr.evaluate("20/10");
        Assertions.assertEquals(2,result);
    }


    @Test
   public void testCaseEvalIllegalInput() {
        // set up user
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate("+1023"));
        Assertions.assertEquals("The input is invalid : Valid is : <int>operator<int> where <int> cab be any digit " +
                        "and allowed operators are [+,-,*,/]", exception.getMessage());
    }

    @Test
    public void testCaseZeroDivideError() {
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate("20/0"));
        Assertions.assertEquals("The input is invalid : Valid is : <int>/<int> where second <int> should be greater than 0", exception.getMessage());
    }

    @Test
    public void testCasePassingNullAsArgument() {
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate(null));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }

    @Test
    public void testCasePassingEmptyStringAsInput() {
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate(""));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());

    }
}
