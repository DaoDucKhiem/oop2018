/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.test;

/**
 *
 * @author DUC KHIEM
 */
import week2.task1.Task1;
import week2.task2.Fraction;
import week2.task3.Task3;
import week2.task3.Task3.Cat;
/**
 *
 * @author DUC KHIEM
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Task1.gcd(14,17);
        System.out.println("");
        Task1.fibonacci(9);
        System.out.println("");
        
        Fraction obj2 = new Fraction(2,3);
        Fraction obj3 = new Fraction(3,5);
        Fraction obj4 = obj2.add(obj3);
        System.out.printf("tong hai phan so la: %d/%d\n",obj4.getNumerator(), obj4.getDenominator() );
        Fraction obj5 = obj2.subtract(obj3);
        System.out.printf("hieu hai phan so la: %d/%d\n", obj5.getNumerator(), obj5.getDenominator());
        Fraction obj6 = obj2.multiply(obj3);
        System.out.printf("tich hai phan so la: %d/%d\n", obj6.getNumerator(), obj6.getDenominator());
        Fraction obj7 = obj2.divide(obj3);
        System.out.printf("thuong hai phan so la: %d/%d\n", obj7.getNumerator(), obj7.getDenominator());
        System.out.println(obj2.equals(obj3));
        
        Task3 t3 = new Task3();
        
        Task3.Cat cat1 = t3.new Cat("bong", 2,"ta","black and while");
        cat1.Meo();
        Cat cat2 = t3.new Cat("bang", 3, "ta", "yellow");
        System.out.printf("hai con meo cung giong khong? %b\n", cat1.sameBreed(cat2));
        cat1.ageOfTwoCat(cat2);
    }
    
}
