class basicRecursion{
//SUM OF NATURAL NUMBERS
    public static int SumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + SumOfNaturalNumbers(n - 1);
        }
    }
}
