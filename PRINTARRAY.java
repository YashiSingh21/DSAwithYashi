class basicRecursion{
  //PRINTING ARRAY
    public static void printArray(int[] arr, int index) {
        if (index != -1) {
            System.out.println(arr[index] + " ");
            printArray(arr, index - 1);
        }
    }
}
