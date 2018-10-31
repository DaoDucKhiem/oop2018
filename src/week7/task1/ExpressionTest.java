/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author DUC KHIEM
 */
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeral num1 = new Numeral();
        Numeral num2 = new Numeral(1);
        Numeral num3 = new Numeral(2);
        Numeral num4 = new Numeral(3);
        
        Square sq = new Square();
        sq.square(num1);
        Subtraction sub = new Subtraction(sq, num2);
        Multiplication mul = new Multiplication(num3, num4);
        Addition add = new Addition(sub, mul);
        Square sq2 = new Square();
        sq2.square(add);
        
        System.out.println("("+num1.evalute()+"^2 - "+num2.evalute()+" + "+num3.evalute()+"*"+num4.evalute()+")^2 = "+sq2.evalute());
        
        Numeral num5 = new Numeral(0);
        try{ 
            Division div = new Division(num4, num5);
            System.out.println(div.evalute());
        }
        catch(ArithmeticException a) {
            System.out.println(a);
        }
    }
    
}
