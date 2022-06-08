import java.util.Arrays;
import java.util.Scanner;

public class primeSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        boolean[] ans = sieveOfEratosthenes(n);
////        for(int i=0;i<ans.length;i++){
////            System.out.println(i+" "+ans[i]);
////        }
        System.out.println(sieveOfEratosthenes(n));
    }
    public static int sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        int count=0;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isPrime[j] = false;
            }
        }
        for(int i=2;i<isPrime.length-1;i++){
            if (isPrime[i]) {
                count+=1;
            }
        }
        return count;
    }
}
