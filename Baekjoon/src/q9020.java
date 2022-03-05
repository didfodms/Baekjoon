import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q9020 {
	
	static int PN = 0;	//소수 개수
	static int[] A = new int[10000];
	static boolean[] isPrime = new boolean[10000];
	
    public static void main(String[] args) throws Exception {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
    	
    	Arrays.fill(isPrime, true);
    	isPrime[0] = isPrime[1] = false;
    	
    	for(int i=2; i<isPrime.length; i++) {
    		if(isPrime[i]) {
    			A[PN++] = i;
    			for(int j=i+i; j<isPrime.length; j+=i) {
    				isPrime[j] = false;
    			}
    		}
    	}
    	
    	String res;
    	StringBuilder sb = new StringBuilder();
    	while(T-- > 0) {
    		res = new String();
    		int n = Integer.parseInt(br.readLine());
    		
    		for(int i=2; i*2<=n; i++) {
    			if(isPrime[i] && isPrime[n-i]) {
    				res = i+" "+(n-i)+"\n";
    			}
    		}
    		
    		sb.append(res);
    	}
    	
    	System.out.println(sb.toString().trim());
    }
}