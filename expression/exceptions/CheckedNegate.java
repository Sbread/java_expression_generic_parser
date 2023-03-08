package expression.exceptions;

import expression.Negate;
import expression.Operand;

public class CheckedNegate extends Negate {
    public CheckedNegate(Operand operand) {
        super(operand);
    }

    @Override
    public int extraEvaluate(int number) {
        if (number == Integer.MIN_VALUE) {
            throw new OverflowException();
        }
        return -number;
    }
}
