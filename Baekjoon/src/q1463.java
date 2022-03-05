import java.util.Scanner;
import java.util.Arrays;

public class q1463{
    static int[] dp;
    
    public static int f(int x){
    	int mm = 1000000000;
        if(x==1) return 0;
        if(dp[x] != -1) return dp[x];
        if(x%3==0) mm = Math.min(mm, f(x/3));
        if(x%2==0) mm = Math.min(mm, f(x/2));
        dp[x] = Math.min(mm, f(x-1))+1;
        
        return dp[x];
    }
    
    public static void main(String[] args){
    	dp = new int[1000001];
    	Arrays.fill(dp, -1);
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.close();
        
        System.out.println(f(n));
    }
}