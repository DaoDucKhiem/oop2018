package week4.task2;

/**
 *
 * @author DUC KHIEM
 */
public class Square extends Rectangle{

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }
    
    public Square(double side) {
        super(side, side);
    }

    public Square() {
        this.setWidth(1.0);
        this.setLength(1.0);
    }

    private void setWidth(double side) {
        this.width = side;
    }

    private void setLength(double side) {
        this.length = side;
    }

    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
}
