import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q11057 {
    static int n;
    static int dp[][];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        //dp[N][K] = N개 자리의 숫자 중 가장 맨뒤의 숫자가 K일때의 경우의 수
        dp = new int[n+1][10];

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        int res = 0;
        for(int i = 0; i < 10; i++) {
            res += dp[n][i];
        }
        System.out.println(res%10007);

    }

}