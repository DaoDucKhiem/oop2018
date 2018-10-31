package week7.task1;

public class Square extends Expression{
    Expression expression;
    
    public void square(Expression e) {
        expression = e;
    }

    @Override
    public String toString() {
        return expression.evalute()+"^2";
    }

    @Override
    public int evalute() {
        return expression.evalute()*expression.evalute();
    }
}
