import java.util.*;

public class FabanociSerries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0; // Initialize c to 0
        
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c; // Return the nth Fibonacci number
    }
}
