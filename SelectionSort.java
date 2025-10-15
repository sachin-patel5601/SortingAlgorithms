import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minid = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minid = j;
                }
            }
            int temp = nums[minid];
            nums[minid] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
        sc.close();
    }
}
