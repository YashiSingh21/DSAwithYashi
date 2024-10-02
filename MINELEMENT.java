public class basicRecursion{
    public int findMin(int[] arr, int n) {
        if (n == 1) 
         return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
}
