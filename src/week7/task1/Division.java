package week7.task1;

/**
 *
 * @author DUC KHIEM
 */
public class Division extends BinaryExpression{
    private final Expression left;
    private final Expression right;

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
       return right;
    }

    @Override
    public String toString() {
        return left+"/"+right;
    }

    @Override
    public int evalute() {
        return left.evalute()/right.evalute();
    }
    
    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
