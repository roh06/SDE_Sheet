import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElementOne {

    // Three Solutions-
    // 1 - Using nested loops -> TC - O(n^2), SC- O(1);
    // 2 - Using HashMap -> TC - O(N log n), SC-O(n);
    // 3 - Moore voting algorithm -> TC- O(n), SC- O(1);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMajorityElementOne(arr,n));
    }

    public static int findMajorityElementOne(int[] nums, int n) {
        int res=-1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        for(Map.Entry entry :mp.entrySet()){
            if((int)entry.getValue()>=((nums.length/2)+1)){
                res = (int)entry.getKey();
                break;
            }
        }
        return res;
    }


    // case when there is atleast a majority element is present
    // Striver solution
    public static int findMajorityElementOptimised(int[]nums, int n ){
        int count=0;
        int element = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                element = nums[i];
            }
            if(element == nums[i]){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        return element;
    }
}
