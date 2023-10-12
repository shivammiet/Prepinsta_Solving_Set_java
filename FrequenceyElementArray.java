import java.util.*;

public class FrequenceyElementArray {
    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 5, 6, 7, 6};
        int n = arr.length;

        findFreq(arr, n);
    }

    public static void findFreq(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;

            if (arr[i] != -1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == x) {
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println(x + " occurs " + count + " times");
            }
        }
    }
}
