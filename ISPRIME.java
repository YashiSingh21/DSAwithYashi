class basicRecursion{
    public static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}
