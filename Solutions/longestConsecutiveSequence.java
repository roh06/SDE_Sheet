import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {100,4,200,1,3,2};
        System.out.println(solve(arr));

    }


    public static int solve(int[]arr){
        Arrays.sort(arr);
        int res = 1;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1] == 1){
                count+=1;
            }
            else if(arr[i]==arr[i-1]){
                continue;
            }
            else{
                count = 1;
            }
            res = Math.max(res,count);
        }
        return res;
    }

    // 2ND METHOD
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res=1;
        HashSet<Integer> box = new HashSet<Integer>();
        for(int a : nums){
            box.add(a);
        }
        for(int i=0;i<nums.length;i++){
            int start = nums[i];
            if(box.contains(start-1)){
                continue;
            }
            while(box.contains(start)){
                start++;
            }
            res = Math.max(res,start-nums[i]);
        }
        return res;

    }
}
