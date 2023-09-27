import java.util.*;
public class primeFactor {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i <n-1; i++){
        if(n%i==0){
            return false;
        }
    }
    
    return true;
    }


    
    public static void primeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n);

    }
    
}
