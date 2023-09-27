import java.util.*;
public class primeNO {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int result = primeNumber(n);
        if(result==0){
            System.out.println("This is not prime");
        }else if(result ==1){
            System.out.println("prime no");
        }else{
            System.out.println("Invalid code");
        }
    }
        

    
    public static int primeNumber(int n){
        if(n==0 || n==1){
           return 0;
        }else{
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
               return 0;
            }
     
            
    }
return 1;
    
}
    }
}
    

