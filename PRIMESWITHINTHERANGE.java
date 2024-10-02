public class basicRecursion{
  public void primesInRange(int start, int end) {
        if (start > end) 
          return;
        if (isPrime(start, 2))
          System.out.print(start + " ");
        primesInRange(start + 1, end);
    }
}
