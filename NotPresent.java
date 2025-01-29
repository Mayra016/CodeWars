import java.util.Arrays;

class NotPresent{
    public static int solve(int [] arr){
        Arrays.sort(arr);
      
        for (int i = 0; i < arr.length; i++) {
          if (Arrays.binarySearch(arr, arr[i]) < 0 || Arrays.binarySearch(arr, -arr[i]) < 0 ) {
            return arr[i];
          }
        }
        return 0;
    }
}
