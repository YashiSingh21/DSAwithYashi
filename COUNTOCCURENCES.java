public class basicRecursion{
  public int countOccurrences(int[] arr, int n, int x) {
        if (n == 0)
         return 0;
        return (arr[n - 1] == x ? 1 : 0) + countOccurrences(arr, n - 1, x);
    }
}
