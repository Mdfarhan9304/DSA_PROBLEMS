package array;
public class Rotatebyk {
    public static int[] rotate(int arr[], int k){
        k%= arr.length;
        rev(arr, 0, arr.length-1);
        rev(arr, 0, k-1);
        rev(arr, k, arr.length-1);
        return arr;
    }

    public static void rev(int arr[], int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        int ans[]= rotate(arr, 6);
        for(int i=0; i<=ans.length-1; i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
