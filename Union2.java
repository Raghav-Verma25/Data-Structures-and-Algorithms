import java.util.HashSet;
public class Union {
    public static void main(String[] args) {
        int arr1[]={5,10,15,15,15,10,80};
        int arr2[]={5,15,10,100};
        HashSet<Integer> s = new HashSet<>();
        for(int i :arr1){
            s.add(i);
        }
        for(int j :arr2){
            s.add(j);
        }
        System.out.println(s);
        System.out.println(s.size());
    }
}
