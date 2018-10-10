package week4.task1;

class Fruit {
	Double price; // giá bán
	Double quantily; // số lượng
	String date; // ngày nhập
	String origin; // xuất sứ
	String expirationDate; // hạn sử dụng
	
	public Fruit(Double price, Double quantily, String date, String origin, String expirationDate) {
		this.price = price;
		this.quantily = quantily;
		this.date = date;
		this.origin = origin;
		this.expirationDate = expirationDate;
	}
	/**
		check hạn sử dụng
		return đã hết hạn dùng hay chưa
	*/
	public boolean checkExpirationDate(String date) {
		if( this.expirationDate.compareTo(date) < 0) return false;
		else return true;
	}
}