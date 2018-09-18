package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    private String name;
    private String id;
    private String group;
    private String email;
    
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    //name
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    //ID
    public void setID(String id_) {
        this.id = id_;
    }

    public String getID() {
        return id;
    }

    //Group
    public void setGroup(String g) {
        this.group = g;
    }

    public String getGroup() {
        return group;
    }

    //Email
    public void setEmail(String e) {
        this.email = e;
    }

    public String getEmail() {
        return email;
    }

    //get Infor
    String getInfo() {
        // TODO:
        System.out.printf("%-20s \t", getName());
        System.out.printf("%-10s \t", getID());
        System.out.printf("%-10s \t", getGroup());
        System.out.printf("%s", getEmail());
        System.out.println("");
        return null; // xóa dòng này sau khi cài đặt
    }
}
