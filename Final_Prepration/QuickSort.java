package Final_Prepration;

public class QuickSort {

    public static void quickSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] > pivot) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //j -> high, i+1
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            high = i;
        }

    }

    public static void main(String[] args) {

    }

}
