import java.util.*;
public class sumNnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNnatura(n));


    }
    public static int sumNnatura(int n){

    int sum = 0;
    for(int i = 0 ; i <= n; i++){
        sum +=i;

    }
    return sum;

}
}
    

