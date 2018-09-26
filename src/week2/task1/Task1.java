package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        int x = 0;
        boolean check = true;
        while( check )
        {
            if(a==0)
            {
                x = b;
                check = false;
            }
            else if(b==0)
            {
                x = a;
                check = false;
            }
            else if(a>b) a %= b;
            else b %= a;
        }
        return x;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int f = 0;
        int f0 = 0;
        int f1 = 1;
        int i = 0;
        while(i<=n)
        {
            switch (i) {
                case 0:
                    f = 0;
                    break;
                case 1:
                    f = 1;
                    break;
                default:
                    f = f0 + f1;
                    f0 = f1;
                    f1 = f;
                    break;
            }
           i++;    
        }
        return f;
    }
}
