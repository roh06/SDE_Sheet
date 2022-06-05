import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElementTwo {

    public static void main(String[] args) {

    }

    // First Method
    public static List<Integer> solve1(int[]nums){
        List<Integer> lis = new ArrayList<>();
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
            if((int)entry.getValue()>((nums.length/3))){
                lis.add((Integer) entry.getKey());

            }
        }
        return lis;
    }
    // Optimised Approach
    public static ArrayList<Integer> solve2(int[]arr){
        int count1=0;
        int count2=0;
        int number1 = -1;
        int number2 = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number1){
                count1+=1;
            }
            else if (arr[i] == number2) {
                count2+=1;
            }
            else if(count1==0){
                number1 = arr[i];
                count1 = 1;
            }
            else if(count2==0){
                number2 = arr[i];
                count2 = 1;
            }
            else{
                count1-=1;
                count2-=1;
            }
        }
        ArrayList<Integer> lis = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number1){
                count1+=1;
            }
            else if(arr[i] == number2){
                count2+=1;
            }
        }
        if(count1>arr.length/3){
            lis.add(number1);
        }
        if(count2>arr.length/3){
            lis.add(number2);
        }
        return lis;
    }
}
