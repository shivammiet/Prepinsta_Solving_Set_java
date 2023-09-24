import java.util.*;
public class SumofGivenRange {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(givenrange(n,m));

}
public static int givenrange(int n, int m){
    int sum= 0;
    for(int i = n ; i <=m; i++){
        sum+=i;

    }
    return sum;

}
    
}
