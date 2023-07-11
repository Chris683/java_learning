package writtentest;

/**
 * @author Chris
 * @create 2021-09-10-10:30
 */
public class lcd {
    public static void main(String[] args) {
        String str1 = "asdfgh";
        String str2 = "asg";
        System.out.println(longString(str1,str2));
    }

    public static int longString(String str1,String str2){
        int m= str1.length();
        int n =str2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }
        return dp[m][n];
    }
}
