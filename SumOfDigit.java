import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(sumdigiit(n));


    }

    public static int sumdigiit(int n){
         int digit = 0, sum=0;
        while(n!=0){
             digit = n%10;
            sum +=digit;
            n /=10;
        }
        return sum;
        
            


        }
        

        }

    
