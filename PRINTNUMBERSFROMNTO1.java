public class basicRecursion{
    public void printNTo1(int n) {
        if (n == 0)
         return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }
}
