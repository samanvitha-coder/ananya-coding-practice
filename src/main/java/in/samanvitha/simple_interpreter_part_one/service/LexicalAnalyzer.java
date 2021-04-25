package in.samanvitha.simple_interpreter_part_one.service;
import in.samanvitha.simple_interpreter_part_one.model.Token;
import in.samanvitha.simple_interpreter_part_one.model.TokenType;

public class LexicalAnalyzer {

    public String input;
    private int currentIndex = 0;
    public char current_char='0';
    Token currentToken=null;
    public LexicalAnalyzer(String input){
        this.input = input;
        current_char = input.charAt(currentIndex);
    }
    public int advance(){
        currentIndex = currentIndex+1;
        if(currentIndex == input.length() ){
            current_char=' ';
        }
        else{
            current_char=input.charAt(currentIndex);
        }
       return current_char;
    }
    public String integer(){
         String result="";
        while(Character.isDigit(current_char)){
            result=result+current_char;
            advance();
        }
        return result;
    }

    public Token getNextToken(){
        Token currentToken = null;

        /*
        9+2 -> input.lenght => 3
        0,1,2 -> indexes
         */
        if(currentIndex == input.length() ){
            currentToken = new Token(null, TokenType.EOF);
        }

        char currentChar = input.charAt(currentIndex++);

        if(Character.isDigit(currentChar)){
            currentToken = new Token(integer() + "" , TokenType.INTEGER);
        }else if(currentChar == '+'){
            currentToken = new Token(currentChar + "" , TokenType.PLUS);

        }

        return currentToken;
    }
}

/*public class LexicalAnalyzer {
    private String input;
    public String str="";
    public String str1="";
    private int currentIndex = 0;
    private int count=0;

    public LexicalAnalyzer(String input){

        this.input = input;
    }

    public Token getNextToken(){
        Token currentToken = null;


     //   9+2 -> input.length => 3
       // 0,1,2 -> indexes


        char currentChar = input.charAt(currentIndex++);
        System.out.println("current char = " + currentChar);
        str = str + String.valueOf(currentChar); // +String.valueOf(input.charAt(index));
        int index=currentIndex;
        System.out.println("str " +str);
        System.out.println("Str1 "+str1);
        if(currentChar == '+'){
            System.out.println("PLUS");
            currentToken = new Token(currentChar + "" , TokenType.PLUS);}


        if(input.charAt(index)!='+' ) {
            if (count == 0)
                currentToken = new Token("" + "", TokenType.INTEGER);
            if (count == 1) {
                currentToken = new Token("" + "", TokenType.INTEGER);
                str1 = str1 + String.valueOf(currentChar);
            }
        }
        if(input.charAt(index)== '+') {

                currentToken = new Token(str + "", TokenType.INTEGER);
                count = 1;

        }
        if(currentIndex == input.length()) {
            currentToken = new Token(str1 + "", TokenType.INTEGER);
            currentToken = new Token(null, TokenType.EOF);
        }







       /* if(currentIndex == input.length() ){
            currentToken = new Token(null, TokenType.EOF);
            System.out.println(currentIndex);
        }

        char currentChar = input.charAt(currentIndex++);
        System.out.println(currentChar);

        if(Character.isDigit(currentChar)){
            currentToken = new Token(currentChar + "" , TokenType.INTEGER);
            System.out.println(currentIndex);
        }else if(currentChar == '+'){
            currentToken = new Token(currentChar + "" , TokenType.PLUS);
            System.out.println(currentIndex);
        }*/
     //   System.out.println("Current = "+currentToken);
       // return currentToken;
   // }
//}
