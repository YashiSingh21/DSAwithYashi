public class basicRecursion{
public void decimalToBinary(int n) {
        if (n == 0)
         return;
        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }
}
