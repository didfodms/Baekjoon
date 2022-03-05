import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2750 {

	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] A = new int[t];
		for(int i=0; i<t; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(A);
		for(int i=0; i<t; i++) {
			sb.append(A[i]+"\n");
		}
		System.out.println(sb.toString());
	}
}
