package week4.task1;

public class Orange extends Fruit {
	String smell; // hương vị
	String color; // màu sắc

    public Orange(Double price, Double quantily, String date, String origin, String expirationDate) {
        super(price, quantily, date, origin, expirationDate);
    }

   
    /**
    xét có phải là cùng một loại cam hay không
    trả về đúng nếu giống và trả về sai nếu khác loại
     */
    public boolean sameOfCam(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orange other = (Orange) obj;
        if (!Objects.equals(this.smell, other.smell)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }
}
