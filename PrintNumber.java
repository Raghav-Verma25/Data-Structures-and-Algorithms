public class Recursive {
public static void PrintNum(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    PrintNum(n-1);
    }

    public static void main(String[] args) {
            int n=10;
            PrintNum(n);
    }
}
