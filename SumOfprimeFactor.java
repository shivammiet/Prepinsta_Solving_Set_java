import java.util.*;

public class SumOfprimeFactor {

    public static void primeFactor(int n) {
       // int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                //sum +=i;
               // n = n / i;
            
        }
       // System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        primeFactor(n);
    
}
}
    
