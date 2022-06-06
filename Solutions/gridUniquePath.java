public class gridUniquePath {
    public static int uniquePaths(int m, int n) {
        return helper(0,0,m,n);
    }
    public static int helper(int i, int j, int m, int n){
        if(i==(n-1) && j==(m-1)){
            return 1;
        }
        if(i>=n || j>=m){
            return 0;
        }
        else{
            return helper(i+1,j,m,n)+helper(i,j+1,m,n);
        }
    }

    //2nd approach -
    public static int solve2(int m, int n){
        int[][]dp = new int[m][n];
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(i==0 || j==0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n -1];
    }

}
