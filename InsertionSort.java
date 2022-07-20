import java.util.Arrays;

public class InsertionSort {
    static void SortingAlgo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        SortingAlgo(arr);
    }
}
