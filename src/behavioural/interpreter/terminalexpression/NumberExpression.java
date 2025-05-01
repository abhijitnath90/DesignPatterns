package behavioural.interpreter.terminalexpression;

import behavioural.interpreter.abstractexpression.Expression;
import behavioural.interpreter.context.Context;

public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
