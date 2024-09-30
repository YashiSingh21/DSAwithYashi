//SOME MORE PROBLEMS OF RECURSION.
public class RecursionProblems {

 // Subset Sum Problem
    public boolean subsetSum(int[] arr, int n, int sum) {
        if (sum == 0)
         return true;
        if (n == 0 && sum != 0)
         return false;
        if (arr[n - 1] > sum) 
        return subsetSum(arr, n - 1, sum);
        return subsetSum(arr, n - 1, sum) || subsetSum(arr, n - 1, sum - arr[n - 1]);
    }

   
 // Longest Common Subsequence (LCS)
    public int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0)
         return 0;
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
         return 1 + lcs(s1, s2, m - 1, n - 1);
        return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
    }

 // Josephus Problem
    public int josephus(int n, int k) {
        if (n == 1)
         return 0;
        return (josephus(n - 1, k) + k) % n;
    }

 // Print Numbers from 1 to N
    public void print1ToN(int n) {
        if (n == 0) 
         return;
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

 // Print Numbers from N to 1
    public void printNTo1(int n) {
        if (n == 0)
         return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

 // Count Digits of a Number
    public int countDigits(int n) {
        if (n == 0)
         return 0;
        return 1 + countDigits(n / 10);
    }

 // Find Maximum Element in an Array
    public int findMax(int[] arr, int n) {
        if (n == 1)
         return arr[0];
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

 // Find Minimum Element in an Array
    public int findMin(int[] arr, int n) {
        if (n == 1) 
         return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

// Sum of Elements in an Array
    public int sumArray(int[] arr, int n) {
        if (n == 0)
         return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

 // Product of Array Elements
    public int productArray(int[] arr, int n) {
        if (n == 0)
         return 1;
        return arr[n - 1] * productArray(arr, n - 1);
    }

 // Check if an Array is Sorted
    public boolean isSorted(int[] arr, int n) {
        if (n == 1)
         return true;
        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }

// Find nth Triangular Number
    public int nthTriangularNumber(int n) {
        if (n == 0)
          return 0;
        return n + nthTriangularNumber(n - 1);
    }

// Count Occurrences of an Element in an Array
    public int countOccurrences(int[] arr, int n, int x) {
        if (n == 0)
         return 0;
        return (arr[n - 1] == x ? 1 : 0) + countOccurrences(arr, n - 1, x);
    }

// Find Length of a String
    public int stringLength(String s) {
        if (s.equals(""))
         return 0;
        return 1 + stringLength(s.substring(1));
    }


 // Reverse a Number
    public int reverseNumber(int n, int rev) {
        if (n == 0)
         return rev;
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    
 // Find nth Harmonic Number
    public double nthHarmonic(int n) {
        if (n == 1)
          return 1;
        return 1.0 / n + nthHarmonic(n - 1);
    }

    
// Convert Decimal to Binary
    public void decimalToBinary(int n) {
        if (n == 0)
         return;
        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }

// Convert Binary to Decimal
    public int binaryToDecimal(int n, int power) {
        if (n == 0) 
          return 0;
        return (n % 10) * (int) Math.pow(2, power) + binaryToDecimal(n / 10, power + 1);
    }

// Check if a Number is Prime within a Range
    public void primesInRange(int start, int end) {
        if (start > end) 
          return;
        if (isPrime(start, 2))
          System.out.print(start + " ");
        primesInRange(start + 1, end);
    }

}
