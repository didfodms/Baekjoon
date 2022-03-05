import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2740 {//�տ� �޴� 3�ϰ� 2�� r1, c1, 2�ϰ� 3�� r2, c2
					//c1�ϰ� r2 ���ƾ���.
					//k�� c1������ r2����
	static int r1, r2, c1, c2; 
	static int[][] A, B;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		r1 = Integer.parseInt(st.nextToken());
		c1 = Integer.parseInt(st.nextToken());
		A = new int[r1][c1]; 
		for(int i=0; i<r1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<c1; j++) 
				A[i][j] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		r2 = Integer.parseInt(st.nextToken());
		c2 = Integer.parseInt(st.nextToken());	
		B = new int[r2][c2];
		for(int i=0; i<r2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<c2; j++) 
				B[i][j] = Integer.parseInt(st.nextToken());
		}
		
		
		
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				int sum = 0;
				for(int k=0; k<c1; k++) {
					sum += A[i][k] * B[k][j];
				}
				sb.append(sum+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}
	
}
