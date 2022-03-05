import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q10989 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(A);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(A[i]+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
