import java.util.*;
public class pailandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
System.out.println(paild(n));

    }
    public static boolean paild(int n){
        int rev = 0, rem;
         int original = n;

         while(n != 0){
        rem = n %10;
        rev = rev *10 +rem;
        n /=10;

         }
if(original==rev){
    System.out.println("paildrome");
        }
else{
    System.out.println("This is not paildrome");
}
return original == rev;

}
}