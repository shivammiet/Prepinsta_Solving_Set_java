import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arm(n));
        sc.close();
    }

    public static boolean Arm(int n) {
        int sum = 0;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digit);
            n /= 10;
        }

        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("This is not Armstrong");
        }

        return original == sum;
    }
    
}
