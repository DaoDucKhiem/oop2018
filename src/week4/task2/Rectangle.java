package week4.task2;

/**
 *
 * @author DUC KHIEM
 */
public class Rectangle extends Shape{
    double width;

    double length;
    
    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.length = length;
    }
    

    public Rectangle(double width, double length) {
        this.setWidth(width);
        this.setLength(length);
    }

    public Rectangle() {
        this.setWidth(1.0);
        this.setLength(1.0);
    }
    
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    public double getArea() {
        return this.getWidth()*this.getLength();      
    }
    
    public double getPerimeter() {
        return 2*(this.getWidth()+this.getLength());
    }
       
}
