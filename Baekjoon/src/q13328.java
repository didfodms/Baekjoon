import java.util.Scanner;

public class q13328 {
	static int dim;
	
	static void MatMul(int[][] a, int[][] b, int[][] c) {
		for(int i=0; i<dim; i++) {
			for(int j=0; j<dim; j++) {
				int ss = 0;
				for(int k=0; i<dim; k++) {
					ss += a[i][k]*b[k][j];
				}
				c[i][j] = ss;
			}
		}
	}
	
	static void MatCopy(int[][] a, int[][] b) {
		for(int i=0; i<dim; i++)
			for(int j=0; j<dim; j++)
				b[i][j] = a[i][j];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dim = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		
		int[][] A = new int[dim][dim];
		int[][] B = new int[dim][dim];
		int[][] S = new int[dim][dim];
		
		for(int i=0; i<dim; i++) A[0][i] = 1;
		for(int i=1; i<dim; i++) A[i][i-1] = 1;
		for(int i=0; i<dim; i++) S[i][i] = 1;
		
		while(t >= 1) {
			if(t%2==1) {
				MatMul(S, A, B); MatCopy(B, S);
			}
			t = t >> 1;
			MatMul(A, A, B);
			MatCopy(B, A);
		}
		System.out.println(S[0][0]);
	}
}
