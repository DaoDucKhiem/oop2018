package week3;

public class Week3Test {

    public static void main(String[] args) {
  
    // TODO: Viết 5 testcase cho phương thức max()
        System.out.printf("max cua 3 va 5 la: %d\n",Week3.max(3,5));
        System.out.printf("max cua 9 va 5 la: %d\n",Week3.max(9,5));
        System.out.printf("max cua 1 va 6 la: %d\n",Week3.max(1,6));
        System.out.printf("max cua 2 va 15 la: %d\n",Week3.max(2,15));
        System.out.printf("max cua 100 va 1000 la: %d\n",Week3.max(100,1000));
        
    // TODO: Viết 5 testcase cho phương thức minOfArray()
        int [] arr1;
        arr1 = new int [] {2, 55, 34, 87, 11};
        int [] arr2;
        arr2 = new int [] {34, 4, 50, 93, 20};
        int [] arr3;
        arr3 = new int [] {23, 44, 52, 9, 35};
        int [] arr4;
        arr4 = new int [] {36, 12, 5, 33, 21};
        int [] arr5;
        arr5 = new int [] {54, 55, 26, 7, 33};
        
        System.out.printf("min array1 la: %d\n", Week3.minOfArray(arr1));
        System.out.printf("min array2 la: %d\n", Week3.minOfArray(arr2));
        System.out.printf("min array3 la: %d\n", Week3.minOfArray(arr3));
        System.out.printf("min array4 la: %d\n", Week3.minOfArray(arr4));
        System.out.printf("min array5 la: %d\n", Week3.minOfArray(arr5));

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    
        System.out.println("chieu cao    can nang    BMI");
        System.out.println("167          56          "+Week3.calculateBMI(56, 167));
        System.out.println("150          43          "+Week3.calculateBMI(43, 150));
        System.out.println("170          80          "+Week3.calculateBMI(80, 170));
        System.out.println("180          75          "+Week3.calculateBMI(75, 180));
    }
}