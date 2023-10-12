import java.util.*;

public class KthSmmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(kth(arr, n, k));
    }

    public static int kth(int[] arr, int n, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
