import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class q10830 {
	static int N; static long B;
	static final int Base = 1000;
	
	static void MatMul(int[][] a, int[][] b, int[][] c) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int ss = 0;
				for(int k=0; i<N; k++) {
					ss += a[i][k]*b[k][j];
					ss %= Base;
				}
				c[i][j] = ss;
			}
		}
	}
	
	static void MatCopy(int[][] a, int[][] b) {
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				b[i][j] = a[i][j];
	}
	
	static int[][] MatPower(int[][] a, long b){
		int[][] S = new int[N][N];
		int[][] P = new int[N][N];
		
		for(int i=0; i<N; i++)
			S[i][i] = 1;
		
		while(b>0) {
			if(b%2==1) {
				MatMul(S, a, P);
				MatCopy(P,S);
			}
			b = b>>1;
			MatMul(a, a, P);
			MatCopy(P, a);
		}
		return S;
	}
	
	static void ShowMat(int[][] mat) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++)
				sb.append(mat[i][j]+" ");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		B = Long.parseLong(st.nextToken());
		int[][] a = new int[N][N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++)
				a[i][j] = Integer.parseInt(st.nextToken());
		}
		int[][] r = MatPower(a, B);
		ShowMat(r);
	}
}
