import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class q14754 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][] A = new int[a][b];
		int[] maxS = new int[a];
		long sum = 0;
		//input
		maxS[0] = -1;
		for(int i=0; i<a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<b; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				sum += A[i][j];
				maxS[i] = maxS[i]>A[i][j]?maxS[i]:A[i][j];
			}
		}
		
		//cal
		long max = 0;
		int[] maxF = new int[b];
		maxF[0] = -1;
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				maxF[i] = maxF[i]>A[j][i]?maxF[i]:A[j][i];
			}
		}
		

		for(int i=0; i<a; i++)
			max += maxS[i];
		for(int i=0; i<b; i++)
			max += maxF[i];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				if(maxS[i]==maxF[j]) max -= maxS[i];
			}
		}
		
		System.out.println(sum-max);
	}
}
