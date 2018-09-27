package week2.task2;

public final class Fraction {
    private int numerator;
    private int denominator;
    
    // setNumerator
    void setNumerator( int n ) {
        this.numerator = n;
    }
    // setDenominator
    void setDenominator( int d ) {
        this.denominator = d;
    }
    // getNumerator
    public int getNumerator() {
        return numerator;
    }
    // getDenominator
    public int getDenominator() {
        return denominator;
    }
    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction add = new Fraction(0,1); // khởi tạo đối tượng để trả về phép cộng
        
        int a = this.getDenominator(); // lấy giá trị của mẫu this
        
        int n = this.getNumerator()* other.getDenominator(); //tử this nhân mẫu other
        
        int d = a*other.getDenominator(); //mẫu số chung
        
        add.setNumerator(n + a*other.getNumerator()); //cộng tử vs tử
        
        add.setDenominator(d);    //mẫu số chung 
        
        return add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sub = new Fraction(0,1); // khởi tạo đối tượng để trả về phép trừ
        
        int a = this.getDenominator(); // lấy giá trị của mẫu this
        
        int n = this.getNumerator()* other.getDenominator(); //tử this nhân mẫu other
        
        int d = a* other.getDenominator(); //mẫu số chung
        
        sub.setNumerator(n - a*other.getNumerator()); //trừ tử vs tử
        
        sub.setDenominator(d);    //mẫu số chung
        
        return sub;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        
        Fraction mul = new Fraction(0,1); // khởi tạo đối tượng để trả về phép nhân
        
        mul.setNumerator(this.getNumerator()*other.getNumerator()); // nhân tử vs tử
        
        mul.setDenominator(this.getDenominator()*other.getDenominator());
        
        return mul;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction div = new Fraction(0,1); // khởi tạo đối tượng để trả về phép chia
        
        div.setNumerator(this.getNumerator()*other.getDenominator()); // nhân tử vs mẫu
        
        div.setDenominator(this.getDenominator()*other.getNumerator()); // nhân mẫu với tử
        
        return div;
    }
    
    //kiểm tra hai phân số bằng nhau
    public boolean equals( Object other ) {
        Fraction ab = (Fraction)other;
        boolean check = false;
        if( this.getNumerator() == ab.getNumerator() && this.getDenominator() == ab.getDenominator() ) check = true; 
        return check;
    }
}
