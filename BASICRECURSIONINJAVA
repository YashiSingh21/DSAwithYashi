// BASIC RECURSION QUESTIONS.
class basicRecursion {

//FACTORIAL

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

//SUM OF NATURAL NUMBERS

    public static int SumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + SumOfNaturalNumbers(n - 1);
        }
    }

//FIBONACCI

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

//POWER

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }
    }

//REVERSE THE STRING

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

//SUM OF DIGITS OF A NUMBER

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

//GCD

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

//PRINTING ARRAY

    public static void printArray(int[] arr, int index) {
        if (index != -1) {
            System.out.println(arr[index] + " ");
            printArray(arr, index - 1);
        }
    }

//FINDING WHETHER THE NUMBER IS PRIME OR NOT

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

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(SumOfNaturalNumbers(7));
        System.out.println(fibonacci(8));
        System.out.println(pow(8, 8));
        System.out.println(reverseString("yashisingh"));
        System.out.println(sumOfDigits(397));
        System.out.println(gcd(19, 5));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arr, arr.length - 1);
        System.out.println(isPrime(36, 2));
    }
}
