package week4.task2;

/**
 *
 * @author DUC KHIEM
 */

public class Circle extends Shape{
    private double radius;
    public Circle() {
        this.setRadius(1.0);
    }

    @Override
    public String toString() {
        return "Circle{" + "Pi=" + Pi + ", radius=" + radius + '}';
    }
    
    public Circle( double radius) {
        this.setRadius(radius);
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Pi*this.getRadius()*this.getRadius();   
    }
    
    public double getPerimetter() {
        return Pi*2*this.getRadius();
    }
}
