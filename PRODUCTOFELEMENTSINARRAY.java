public class basicRecursion{
  public int productArray(int[] arr, int n) {
        if (n == 0)
         return 1;
        return arr[n - 1] * productArray(arr, n - 1);
    }
} 
