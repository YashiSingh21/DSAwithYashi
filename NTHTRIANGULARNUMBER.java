public class basicRecursion{
   public int nthTriangularNumber(int n) {
        if (n == 0)
          return 0;
        return n + nthTriangularNumber(n - 1);
    }
}
