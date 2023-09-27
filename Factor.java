import java.util.*;
public class Factor {

    public static void factor(int n){
        //System.out.println("factoria no.");
        for(int i = 1 ; i < n; i++){
            if(n%i==0){
                System.out.println(i+"");
            }
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factor(n);

    }
    
}
