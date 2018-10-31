package week7.task1;

/**
 *
 * @author DUC KHIEM
 */
public class Subtraction extends BinaryExpression{

    private Expression left;
    private Expression right;
    
    @Override
    public String toString() {
        return left.evalute()+" - "+right.evalute();
    }

    @Override
    public int evalute() {
        return left.evalute()-right.evalute();
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }
    
    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
}
