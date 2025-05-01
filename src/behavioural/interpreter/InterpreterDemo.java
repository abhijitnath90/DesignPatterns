package behavioural.interpreter;


import behavioural.interpreter.abstractexpression.Expression;
import behavioural.interpreter.context.Context;
import behavioural.interpreter.nonterminalexpression.AdditionExpression;
import behavioural.interpreter.nonterminalexpression.MultiplicationExpression;
import behavioural.interpreter.terminalexpression.NumberExpression;

public class InterpreterDemo {

    public static void main(String[] args) {

        //Create the expression: 2 + 3 * 4
        Expression expression = new AdditionExpression(new NumberExpression(2),
                new MultiplicationExpression(new NumberExpression(3), new NumberExpression(4)));

        //Create the context, if needed
        Context context = new Context();

        //Interpret the expression
        int result = expression.interpret(context);
        System.out.println("Result: "+result);
    }
}
