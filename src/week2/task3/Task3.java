package week2.task3;

public class Task3 {

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
//mèo
    public class Cat {

        private String name;
        private int age;
        private String breed;
        private String color;

        private void setName(String name_) {
            this.name = name_;
        }

        private void setAge(int age_) {
            this.age = age_;
        }

        private void setBreed(String breed_) {
            this.breed = breed_;
        }

        private void setColor(String color_) {
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

        public Cat(String a, int b, String c, String d) {
            this.setName(a);
            this.setAge(b);
            this.setBreed(c);
            this.setColor(d);
        }

        // tiếng kêu
        public void Meo() {
            System.out.println("meoooo....meoooo....");
        }

        //xét hai con mèo có cùng giống hay không
        public boolean sameBreed(Cat other) {
            return this.getBreed().equals(other.getBreed());
        }

        //so sanh tuổi của hai con mèo
        public void ageOfTwoCat(Cat other) {
            if (this.getAge() > other.getAge()) {
                System.out.println(">");
            } else if (this.getAge() < other.getAge()) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }

//class giáo viên
    public class Teacher {

        private String name;
        private int age;
        private String Subject;
        private String married;

        private void setName(String name_) {
            this.name = name_;
        }

        private void setAge(int age_) {
            this.age = age_;
        }

        private void setSubject(String sub) {
            this.Subject = sub;
        }

        private void setMarried(String married_) {
            this.married = married_;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSubject() {
            return Subject;
        }

        public String getMarried() {
            return married;
        }

        public Teacher(String a, int b, String c, String d) {
            this.setName(a);
            this.setAge(b);
            this.setSubject(c);
            this.setMarried(d);
        }
        
        // in ra tên
        public void name() {
            System.out.println("name: " + this.getName());
        }

        //tinh trạng hôn nhân
        public boolean married(String Answer) {
            return this.getMarried().equals(Answer);
        }

        //xet hai doi tuong teacher có dạy cùng môn không
        public boolean sameSubject(Teacher other) {
            return this.getSubject().equals(other.getSubject());
        }

    }

//class student
    public class Student {

        private String name;
        private int age;
        private String id;
        private String group;

        private void setName(String name_) {
            this.name = name_;
        }

        private void setAge(int age_) {
            this.age = age_;
        }

        private void setId(String id) {
            this.id = id;
        }

        private void setGroup(String group_) {
            this.group = group_;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getId() {
            return id;
        }

        public String getGroup() {
            return group;
        }

        public Student(String a, int b, String c, String d) {
            this.setName(a);
            this.setAge(b);
            this.setGroup(d);
            this.setId(c);
        }
        //in ra mã sinh viên
        public void printId() {
            System.out.println("id: " + this.getId());
        }

        //in ra tên sinh viên 
        public void printName() {
            System.out.println("name: " + this.getName());
        }

        //xem sinh viên có thuộc group không?
        public boolean check(Student other) {
            return this.getGroup().equals(other.getGroup());
        }
    }
}
