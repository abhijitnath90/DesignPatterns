package behavioural.interpreter.abstractexpression;

import behavioural.interpreter.context.Context;

public interface Expression {

    int interpret(Context context);
}
