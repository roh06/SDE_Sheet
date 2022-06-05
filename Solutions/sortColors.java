import java.util.Scanner;

public class sortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        solve(arr);
        printArray(arr);

    }

    public static void printArray(int[]arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void solve(int[]arr){
        int nz=0;
        int i=0;
        int nt = arr.length-1;
        while(i<=nt){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                i+=1;
                nz++;
            }
            else if(arr[i]==2){
                int temp = arr[i];
                arr[i] = arr[nt];
                arr[nt] = temp;
                nt--;
            }
            else{
                i+=1;
            }
        }

    }
}
