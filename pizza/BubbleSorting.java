public class BubbleSorting {

    public static void PrintArray(int arr[]) {
        for (int s = 0; s < arr.length; s++) {
            System.out.print(arr[s] + "\t");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6 };
        // bubble sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int santosh = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = santosh;
                }
            }
        }
        PrintArray(arr);

    }
}
