import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];
            if (mp.containsKey(check)) {
                res[0] = mp.get(check);
                res[1] = i;
                break;
            } else {
                mp.put(nums[i], i);
            }
//            if(mp.containsKey(target-numbers[i])){
//                res[1] = i;
//                res[0] = mp.get(target-numbers[i]);
//                return res;
//            }
//            mp.put(numbers[i],i);
        }
        return res;
    }
}
