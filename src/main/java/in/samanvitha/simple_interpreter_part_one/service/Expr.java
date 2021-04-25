package in.samanvitha.simple_interpreter_part_one.service;

import in.samanvitha.simple_interpreter_part_one.model.Token;
import in.samanvitha.simple_interpreter_part_one.model.TokenType;

import java.util.HashMap;
import java.util.Map;


public class Expr {
    private Map<Integer, TokenType> structure;

    /*
    index ->
    0 -> left
    1 -> middle
    2 -> right
     */
    public Expr() {
        this.structure = new HashMap<>();
        this.structure.put(0, TokenType.INTEGER);
        this.structure.put(1, TokenType.PLUS);
        this.structure.put(2, TokenType.INTEGER);
    }

    private boolean validate(Token token, TokenType tokenType) {
        return ((token != null) && (token.getType() == tokenType));
    }

    public int evaluate(String input) {
        Token[] tokens = new Token[3];
        /*
        structure of the language ->
        integer+integer and the integer are single digit
         */
        LexicalAnalyzerV2 analyzer = new LexicalAnalyzerV2(input);

        for (int i = 0; i < 3; i++) {
            tokens[i] = analyzer.getNextToken(); // tokens[0] -> left // tokens[1] -> middle //tokens[2] -> right
            if (!validate(tokens[i], this.structure.get(i))) { //this.structure.get(0) -> o/p -> TokenType.INTEGER
                throw new IllegalArgumentException("The input is invalid : Valid is : <int>+<int> where <int> should be single digit");
            }
        }
        //Integer.parseInt("10") -> int 10
        //  return (Integer.parseInt(tokens[0].getValue())*10+Integer.parseInt(tokens[1].getValue()) + Integer.parseInt(tokens[3].getValue())*10+Integer.parseInt(tokens[4].getValue()));

        return (Integer.parseInt(tokens[0].getValue()) + Integer.parseInt(tokens[2].getValue()));
    }
}
