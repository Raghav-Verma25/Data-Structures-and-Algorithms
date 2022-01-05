import java.util.Scanner;
import java.lang.Math;
public class BinToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary bit ");
        String str = sc.nextLine();
        String arr[] = new String[4];
        int sum=0;
        int len=str.length();
        for(int i=0 ; i<=len+1; i++){
            int bit = Integer.parseInt(String.valueOf(str.charAt(i)));
            double c= Math.pow(2,len-1);
            sum = sum + (int)(c*bit);
            len = len-1;
        }
        System.out.println(sum);
    }
}
