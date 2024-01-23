import java.util.Scanner;

public class prime {
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag;
 
        System.out.println("Enter starting rang: ");
        a = sc.nextInt(); 
 
        System.out.println("\nEnter end range: ");
        b = sc.nextInt(); 
 
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
