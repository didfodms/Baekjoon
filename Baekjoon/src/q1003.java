import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1003{
    static int T, N;
    static int[] dp1, dp2;
    
    static int zero(int n){
        if(n==0) return 1;
        if(n==1) return 0;
        if(dp1[n] != -1) return dp1[n];
        dp1[n] = zero(n-1)+zero(n-2);
        return dp1[n];
    }
    
    static int one(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp2[n] != -1) return dp2[n];
        dp2[n] = one(n-1)+one(n-2);
        return dp2[n];
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        dp1 = new int[41]; dp2 = new int[41];
        Arrays.fill(dp1, -1); Arrays.fill(dp2, -1);
        
        T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
        	N = Integer.parseInt(br.readLine());
        	sb.append(zero(N)+" "+one(N)+"\n");
        }
        System.out.println(sb.toString());
        
    }
}