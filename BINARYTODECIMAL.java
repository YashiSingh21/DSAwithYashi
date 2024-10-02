public class basicRecursion{
 public int binaryToDecimal(int n, int power) {
        if (n == 0) 
          return 0;
        return (n % 10) * (int) Math.pow(2, power) + binaryToDecimal(n / 10, power + 1);
    }
}
