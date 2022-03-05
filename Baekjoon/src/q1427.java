import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1427 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();

		int[] A = new int[n.length()];
		for(int i=0; i<A.length; i++) {
			A[i] = (int)n.charAt(i)-48;
		}
		
		Arrays.sort(A);
		StringBuilder sb = new StringBuilder();
		for(int i=A.length-1; i>=0; i--) {
			sb.append(A[i]);
		}
		
		System.out.println(sb.toString());
	}

}
