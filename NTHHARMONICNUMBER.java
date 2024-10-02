public class basicRecursion{
public double nthHarmonic(int n) {
        if (n == 1)
          return 1;
        return 1.0 / n + nthHarmonic(n - 1);
    }
}
