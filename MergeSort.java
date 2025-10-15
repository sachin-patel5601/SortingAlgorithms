
import java.util.Arrays;
import java.util.Scanner;
public class MergeSort{
    public static  int[] sort(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergesort(int[] nums,int l,int r){
        if(l==r)return ;
        int mid=l+(r-l)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public static  void merge(int[] nums,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        int k=l;
        for(int i=0;i<n1;i++){
            L[i]=nums[k++];
        }
        for(int i=0;i<n2;i++){
            R[i]=nums[k++];
        }
        k=l;
        int i=0,j=0;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                nums[k]=L[i++];
            }else{
                nums[k]=R[j++];
            }
            k++;
        }
        while(i<n1)nums[k++]=L[i++];
        while(j<n2)nums[k++]=R[j++];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int a = 0; a < arr.length; a++) {
              arr[a]=sc.nextInt();
        }
        System.out.println("Before soting :"+Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting :"+Arrays.toString(arr));
        sc.close();
    }
}