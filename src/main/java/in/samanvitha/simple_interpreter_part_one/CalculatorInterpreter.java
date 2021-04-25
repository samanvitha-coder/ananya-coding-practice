package in.samanvitha.simple_interpreter_part_one;
import  in.samanvitha.simple_interpreter_part_one.service.Expr;
import java.util.Scanner;

public class CalculatorInterpreter {
    public static void main(String[] args) {
        System.out.println("This is a simple calculator - Playing around with an interpreter");
        Expr expr = new Expr();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n\nEnter -1 to escape : $>");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("-1")) {
                break;
            }
            Integer result = expr.evaluate(input);
            System.out.println("Sum of:" + input + " = " + result);

          /*
            // input = input.replaceAll(" ","");
          char[] chars = input.toCharArray();
            char[] newchar = {'0','0','+','0','0'};
            if(chars.length==5)
            {
                Integer result = expr.evaluate(input);
                System.out.println("Sum of:" + input + " = " + result);
                count=0;
            }
            else if(chars.length==3) {
                newchar[1]=chars[0];
                newchar[4]=chars[2];
                count=count+1;
                }
            else if(chars.length==4) {
                count = count+1;
                if(chars[1]=='+')
                {
                    newchar[1]=chars[0];
                    newchar[3]=chars[2];
                    newchar[4]=chars[3];

                }
                else if(chars[2]=='+')
                {
                    newchar[0]=chars[0];
                    newchar[1]=chars[1];
                    newchar[4]=chars[3];

                }
            }
            else
                System.out.println("Error please check and add the addition of double or single digit number");

            if(count>0) {
                String input1 = String.valueOf(newchar);
                Integer result = expr.evaluate(input1);
                System.out.println("Sum of:" + input + " = " + result);
            }*/

        }
    }
}
