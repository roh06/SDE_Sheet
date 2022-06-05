import java.util.Scanner;

public class maximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {-2,-1,-3,4,-1,2,1,-5,-4};
        System.out.println(solve(arr));

    }
    public static int solve(int[]arr){
        int sum = 0;
        int result = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>result){
                result = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return result;
    }
}
