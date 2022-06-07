import java.util.HashMap;
import java.util.Scanner;

public class firstAndLastPositionOfElementInSortedArray {
    public static int[] nonOptimised(int[]nums, int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(mp.containsKey(nums[i])){
                    mp.put(nums[i],mp.get(nums[i])+1);
                }
                else{
                    mp.put(nums[i],1);
                }
            }
        }
        int index1 = findFirst(nums,target);
        int index2 =-1;
        Integer hmValue =(Integer) mp.get(target);
        if(hmValue != null){
            index2 = ((int)hmValue+index1)-1;
        }
        //int index2 = ((int)mp.get(target) +index1)-1;

        int[]res = new int[2];
        if(index1 == -1){
            res[0] = -1;
            res[1] = -1;
        }
        else{
            res[0] = index1;
            res[1] = index2;
        }
        return res;
    }
    public static int findFirst(int[] nums, int target) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                index = i;
                break;
            }
        }
        return index;
    }
    public static int[] solve(int[] nums, int target){
        int[]arr = new int[2];
        arr[0] = findFirstIndex(nums,target);
        arr[1] = findLastIndex(nums,target);
        return arr;
    }
    public static int findFirstIndex(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;
        int fi = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] < target){
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                fi = mid;
                high = mid-1;
            }
        }
        return fi;
    }
    public static int findLastIndex(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;
        int li = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] < target){
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                li = mid;
                low = mid+1;
            }
        }
        return li;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {5,7,7,8,8,10};
        int target = 8;
        int[]res = solve(arr,target);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
