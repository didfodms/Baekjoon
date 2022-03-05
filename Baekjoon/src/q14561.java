import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class q14561 {

	static int isPal(String s) {
		StringBuilder sb = new StringBuilder(s);
		
		if(sb.reverse().toString().equals(s)) return 1;
		return 0;
	}
	
	static String jinsu(String num, String jin) {
		String[] N = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
		BigInteger A = new BigInteger(num);
		BigInteger n = new BigInteger(jin);
		BigInteger r = new BigInteger("0");
		StringBuilder sb = new StringBuilder();
		
		while(!A.equals("0")) {
			r = N[Long.parseLong(A.remainder(n))];	//r = A%n;
			A = A.divide(n);	//A /= n;
			n = n.multiply(n);	//n *= n;
			
			sb.append(r);
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			BigInteger A = new BigInteger(st.nextToken());
			BigInteger n = new BigInteger(st.nextToken());
			sb.append(isPal(jinsu(A, n)));
		}

	}

}
