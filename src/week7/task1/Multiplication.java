package week7.task1;

/**
 *
 * @author DUC KHIEM
 */
public class Multiplication extends BinaryExpression{

    private Expression left;
    private Expression right;
    
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
       return left.evalute()+"*"+right.evalute();
    }

    @Override
    public int evalute() {
       return left.evalute()*right.evalute();
    }
    
    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
