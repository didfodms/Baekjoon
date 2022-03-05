import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class q10824 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger AB = new BigInteger(st.nextToken()+st.nextToken());
		BigInteger CD = new BigInteger(st.nextToken()+st.nextToken());
		
		System.out.println(AB.add(CD));
	}

}