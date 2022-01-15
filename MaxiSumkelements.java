import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sum = 0;

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                arr[i] = num;

            }
            int result=0;
            if (n < k) {
                System.out.println("-1");
                
            }
            if (n == k) {
                for (int j = 0; j < n; j++) {
                    sum = sum + arr[j];
                }
                System.out.println(sum);
            }

            if(n>k) {
                //int max = 0;
                for (int i = 0; i < n - k +1; i++) {
                    int sum1=0;
                    for (int j = i; j < k+i; j++) {
                        sum1 = sum1 + arr[j];

                    }
                     result = Math.max(sum1, result);
                }
                System.out.println(result);
            }
            
    }
}
