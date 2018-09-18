package week1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static int n = 100;
    public static Student[] arr = new Student[n];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    static void studentsByGroup() {
        // TODO:
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i].getGroup());
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String a = it.next();
            for(int i=0; i<n; i++)
            {
                if(a.equals(arr[i].getGroup())) arr[i].getInfo();
            }        
        }
    }

    static void removeStudent(String id) {
        // TODO:
        int i;
        for( i=0; i<n; i++)
            if(id.equals(arr[i].getID())) break;
        for( ;i<n-1; i++)
        {
            arr[i] = arr[i+1];
        }
        n--;
    }

    public static void main(String[] args) {
        // TODO:
        Scanner input = new Scanner(System.in);

        Student sv = new Student();
        sv.setName("Dao Duc Khiem");
        sv.setID("17020837");
        sv.setGroup("INT22042");
        sv.setEmail("daoduckhiem1104@gmail.com");

        sv.getInfo();

        Student a = new Student();

        Student b = new Student("khiem", "101", "abd@gmail.com");

        a.setGroup("INT22041");
        a.getInfo();
        b.getInfo();
        if (sameGroup(a, b)) {
            System.out.println("a,b in the same group");
        } else {
            System.out.println("a,b not in the same group");
        }

        //so sinh vien trong mang
        System.out.print("nhap so sinh vien: ");
        n = input.nextInt();
        input.nextLine();
        String x, y, z, t;
        for (int i = 0; i < n; i++) {
            arr[i] = new Student();
            System.out.printf("nhap ten sv %d: ", i + 1);
            x = input.nextLine();
            arr[i].setName(x);

            System.out.print("nhap id: ");
            y = input.nextLine();
            arr[i].setID(y);

            System.out.print("nhap group: ");
            z = input.nextLine();
            arr[i].setGroup(z);

            System.out.print("nhap email: ");
            t = input.nextLine();
            arr[i].setEmail(t);
        }
        studentsByGroup();
        String removeStudent;
        System.out.println("nhap id sinh vien muon xoa: ");
        removeStudent = input.nextLine();
        removeStudent(removeStudent);
        System.out.printf("\t\tdanh sach sau khi xoa");
        for(int i=0; i<n; i++) arr[i].getInfo();
    }
}
