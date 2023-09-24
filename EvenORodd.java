import java.util.*;
public class EvenORodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int result = EvenORodd(n);
        System.out.println(evenodd(n));
    }
    public static int evenodd(int n){
        if(n%2==0){
            System.out.println("even");
        }else{
        System.out.println("odd");

    }
    return n;
}
}
