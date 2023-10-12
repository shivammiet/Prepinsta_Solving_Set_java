import java.util.*;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i = 1; i < n; i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
            if(sum>n){
                System.out.println("AbundatNumbe");
            }else{
                System.out.println("Not abundant No");
            }
        }
    }
    

