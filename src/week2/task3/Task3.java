package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
//mèo
class Cat {
    private String name;
    private int age;
    private String breed;
    private String color;
    
    void setName( String name_ ) {
        this.name = name_;
    }
    
    void setAge( int age_ ) {
        this.age = age_;
    }
    
    void setBreed( String breed_ ) {
        this.breed = breed_;
    }
    
    void setColor( String color_ ) {
        this.color = color_;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
    
    String getBreed() {
        return breed;
    }
    String getColor() {
        return color;
    }
    
    // tiếng kêu
    void Meo() {
        System.out.println("meoooo....meoooo....");
    }
    
    //xét hai con mèo có cùng giống hay không
    boolean sameBreed( Cat other ) {
        return this.getBreed().equals(other.getBreed());
    }
    
    //so sanh tuổi của hai con mèo
    void ageOfTwoCat( Cat other ) {
        if(this.getAge()> other.getAge()) System.out.println(">");
        else if (this.getAge() < other.getAge()) System.out.println("<");
        else System.out.println("=");
    }
}

//class giáo viên
class Teacher {
    private String name;
    private int age;
    private String Subject;
    private String married;
    
    void setName( String name_ ) {
        this.name = name_;
    }
    
    void setAge( int age_ ) {
        this.age = age_;
    }
    
    void setSubject( String sub ) {
        this.Subject = sub;
    }
    
    void setMarried( String married_ ) {
        this.married = married_;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
    
    String getSubject() {
        return Subject;
    }
    
    String getMarried() {
        return married;
    }
    
    // in ra tên
    void name() {
        System.out.println("name: "+this.getName());
    }
    
    //tinh trạng hôn nhân
    boolean married( String Answer ) {
        return this.getMarried().equals(Answer);
    }
    
    //xet hai doi tuong teacher có dạy cùng môn không
    boolean sameSubject( Teacher other ) {
        return this.getSubject().equals(other.getSubject());
    }
    
}

//class student
class Student {
    private String name;
    private int age;
    private String id;
    private String group;
    
    void setName( String name_ ) {
        this.name = name_;
    }
    
    void setAge( int age_ ) {
        this.age = age_;
    }
    
    void setId( String id ) {
        this.id = id;
    }
    
    void setGroup( String group_ ) {
        this.group = group_;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
    
    String getId() {
        return id;
    }
    
    String getGroup() {
        return group;
    }
    
    
    
    //in ra mã sinh viên
    void printId() {
        System.out.println("id: "+this.getId());
    }
    
    //in ra tên sinh viên 
    void printName() {
        System.out.println("name: "+ this.getName());
    }
    
    //xem sinh viên có thuộc group không?
    boolean check( Student other ) {
        return this.getGroup().equals(other.getGroup());
    }
    
    
}