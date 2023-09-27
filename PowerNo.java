import java.util.*;
public class PowerNo {
    public static double power(int digit, int power){
        return Math.pow(digit,power);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int digit= sc.nextInt();
         int power= sc.nextInt();
         System.out.println(power(digit, power));
    }
    
}
