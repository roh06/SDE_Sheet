import java.util.Scanner;

public class searchInA2DMatrix {
    public static boolean solve2(int[][] matrix, int target){
        int i=0;
        int j = matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]>target){
                j--;
            }
            else{
                i+=1;
            }
        }
        return false;
    }
    public static boolean solve(int[][]matrix, int target){
        int r = matrix.length;
        int c = matrix[0].length;
        int low = 0;
        int high = (r*c)-1;
        while(low<=high){
            int mid = (low+(high-low)/2);
            if(matrix[mid/c][mid%c] == target){
                return true ;
            }
            else if(matrix[mid/c][mid%c]< target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[]arr = new int[t];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[arr.length];



    }
}
