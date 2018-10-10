/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;


/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */

public class task1 {
	public static void main(String[] args) throws Exception{
		Fruit chanh = new Fruit(18.5, 120.0, "10/10/2018", "Lang Son", "10/11/2018");
		Apple tao = new Apple(15.0, 150.0,"10/10/2018", "Bac Giang", "18/11/2018");
		tao.crispness = "max";
		Orange cam = new Orange(17.0, 200.0,"10/10/2018", "Lang Son", "12/11/2018");
		CamCaoPong camCP = new CamCaoPong(20.0, 200.0,"10/10/2018", "Hoa Binh", "10/11/2018");
                camCP.doNgot = "max";
		CamSanh camS = new CamSanh(19.4, 150.0,"10/10/2018", "Ha Giang", "15/11/2018");
                camS.doDayVo = "cao";
		System.out.println("qua chanh su dung ngay 26/10/2018 da het han? "+chanh.checkExpirationDate("26/10/2108"));
		System.out.println("camCP va camS co cung loai cam khong? "+camCP.sameOfCam(camS));
	}
}