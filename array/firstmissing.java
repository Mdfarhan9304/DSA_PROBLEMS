package array;
import java.util.Arrays;

public class firstmissing {

    public static int misspos(int arr[]) {
        Arrays.sort(arr);
    
        int missing = 1;
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == missing) {
                missing++;
            } else if (arr[i] > missing) {
                break;
            }
        }
        return missing;
    }
    

    public static void main(String[] args) {
        int array[] = { 3, 2, -6, 1, 4, 3, 5, 0 };

        System.out.println(misspos(array));
    }
}
