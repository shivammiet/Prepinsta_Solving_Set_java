import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(LeapYears(n));

    }

    public static int LeapYears(int n){
        if(n%400==0){
            System.out.println("This is leap year");
        }
        else if(n%4==0){
            System.out.println("this is leap year");

        }
        else if(n%100!=0){
            System.out.println("this is not leap year");
        }
        return n;

        }
    }

    