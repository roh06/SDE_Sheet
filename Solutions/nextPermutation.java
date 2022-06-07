import java.util.ArrayList;
import java.util.Collections;

public class nextPermutation {
    public void nextPermutation(int[]nums){
        if(nums == null || nums.length==1){
            return;
        }
        int idx1 = -1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1 = i;
                break;
            }
        }
        if(idx1<0){
            reverse(nums,0,nums.length-1);
        }
        else{
            int idx2=0;
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[idx1]){
                    idx2 = i;
                    break;
                }
            }
            swap(nums,idx1,idx2);
            reverse(nums,idx1+1,nums.length-1);
        }
    }
    public static void reverse(int[] arr, int i, int j) {
        while(i<j){
            swap(arr,i++,j--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {

    }
}
