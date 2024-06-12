public class array {
    static int[] bubbleSort(int arr[]) {

        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; i++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static void printArray(int arr[]) {

        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void displayArray(int arr[]) {
        // int arr[] ={1,2,3,4,5,6};
        for (int i : arr) {
            System.out.println(i);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("Before sorting");
        printArray(arr);
        arr = bubbleSort(arr);
        System.out.println("After sorting");
        printArray(arr);
        // displayArray(arr);
        arr = bubbleSort(arr);
    }

}
