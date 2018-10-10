/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author DUC KHIEM
 */
public class Shape {
    private String color;
    private boolean filled;
    final double Pi = 3.14;

    public Shape() {
        this.setColor("red");
        this.setFilled(true);
    }

    @Override
    public String toString() {
        return "shape{" + "color=" + color + ", filled=" + filled + '}';
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    private void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Shape( String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }  
}
