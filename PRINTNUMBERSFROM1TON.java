public class basicRecursion{
    public void print1ToN(int n) {
        if (n == 0) 
         return;
        print1ToN(n - 1);
        System.out.print(n + " ");
    }
}
