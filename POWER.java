class basicRecursion{
  //POWER
    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }
    }
}  
