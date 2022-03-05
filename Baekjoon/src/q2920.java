import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q2920 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] des = {8, 7, 6, 5, 4, 3 ,2, 1};
		int[] A = new int[8];
		for(int i=0; i<8; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		String res = "";
		if(Arrays.equals(A, asc)) res = "ascending";
		else if(Arrays.equals(A, des)) res = "descending";
		else res = "mixed";
		System.out.println(res);
	}
}
