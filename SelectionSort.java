import java.util.Arrays;

public class SelectionSort15 {
    public static void main(String[] args) {
        int arr[] = {4,1,9,2,3,6};
        int temp;
        for (int i = 0; i < arr.length ; i++) {
                int min = i;
                for(int j =i+1 ; j<arr.length ; j++){
                    if(arr[min]>arr[j]){
                        min = j;
                    }
                }
                if(min!=i){
                    temp = arr[min];
                    arr[min]= arr[i];
                    arr[i]=temp;
                }
        }
        System.out.println(Arrays.toString(arr));
    }
}
