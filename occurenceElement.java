import java.util.*;
public class occurenceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
            int x = sc.nextInt();
            int arr [] = new int[n];

            for(int i = 0; i <arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(occ(arr,n,x));
        }
            public static int occ(int arr[], int n, int x){
                int count = 0;
                for(int i = 0; i < n; i++){
                    if(arr[i]==x){
                        count++;
                    }
                }
                return count;
        }
    }

    
    

