/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;

public class task2 {
	public static void main(String[] args) throws Exception{
		Shape shape = new Shape();
                System.out.println(shape.toString());
                shape = new Shape("green", false);
                System.out.println(shape.toString());
                
                Circle circle = new Circle();
                System.out.println(circle.toString());
                System.out.println("Area: "+circle.getArea());
                System.out.println("Perimeter: "+circle.getPerimetter());
                circle = new Circle(2.0);
                System.out.println(circle.toString());
                System.out.println("Area: "+circle.getArea());
                System.out.println("Perimeter: "+circle.getPerimetter());
                
                Rectangle rectangle = new Rectangle();
                System.out.println(rectangle.toString());
                System.out.println("Area: "+rectangle.getArea());
                System.out.println("Perimeter: "+rectangle.getPerimeter());
                rectangle = new Rectangle(2.0, 5.0);
                System.out.println(circle.toString());
                System.out.println("Area: "+rectangle.getArea());
                System.out.println("Perimeter: "+rectangle.getPerimeter());
                
                Square square = new Square();
                System.out.println(square.toString());
                System.out.println("Area: "+square.getArea());
                System.out.println("Perimeter: "+square.getPerimeter());
                square = new Square(4.0);
                System.out.println(square.toString());
                System.out.println("Area: "+square.getArea());
                System.out.println("Perimeter: "+square.getPerimeter());
	}
}