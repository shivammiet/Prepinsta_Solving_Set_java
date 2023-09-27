import java.util.*;
import java.util.jar.Manifest;
public class primeNof {

    public static boolean prime(int n){
        boolean  prime = true;
        for(int i = 2; i <= n-1; i++){
            if(n%i==0){
                return false;
                
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (prime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}