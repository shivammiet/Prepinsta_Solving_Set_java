import java.util.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;
public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i = 1 ; i < n; i++){
            if(n%i==0){
               sum = sum +i;
            
        }
        
   
    }
    if(sum==n){
        System.out.println("perfect no");
    }else{
        System.out.println("not perfect no");
    }
}
}