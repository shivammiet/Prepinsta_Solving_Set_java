
import java.util.*;
public class reverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int reverse = 0, rem;
        while(n!=0){
            rem = n%10;
             reverse = reverse * 10 +rem;
            n /= 10;
        };
        return reverse;
        
        }
        

    }
    

