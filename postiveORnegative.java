import java.util.*;
public class postiveORnegative {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = postive(n);
        System.out.println(result);
    }
    public static int postive(int n){
        if(n>0){
            System.out.println("this is postiive");
            }
            else{
                System.err.println("this is negative");
            }
            return n;
        }
    }


