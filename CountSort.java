import java.util.*;
public class CountSort {
  public static void countsort(int[] nums) {
         if (nums.length==0) return;
        int max=nums[0];
        int min=nums[0];
        for (int num:nums) {
            if (num>max)max=num;
            if (num<min)min=num;
        }
        int range=max-min+1;
        int[] count=new int[range];
        for (int num:nums) {
            count[num-min]++;
        }
        int idx=0;
        for (int i=0;i<range;i++) {
            while(count[i]>0) {
                nums[idx++]=i+min;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int a = 0; a < arr.length; a++) {
              arr[a]=sc.nextInt();
        }
        System.out.println("Before soting :"+Arrays.toString(arr));
        countsort(arr);
        System.out.println("After sorting :"+Arrays.toString(arr));
        sc.close();
    }
}