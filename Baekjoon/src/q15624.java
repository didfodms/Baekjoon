import java.util.Scanner;

public class q15624 {
	static final long Base =1000000007;
	
	static void MatMul(long[][] a, long[][] b, long[][] c) {
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				long ss = 0;
				for(int k=0; i<2; k++) {
					ss += a[i][k]*b[k][j];
					ss %= Base;
				}
				c[i][j] = ss;
			}
		}
	}
	
	static void MatCopy(long[][] a, long[][] b) {
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				b[i][j] = a[i][j];
	}
	
	static long Fibo(long p) {
		long[][] S = {{1, 0},{0, 1}};
		long[][] A = {{1, 1},{1, 0}};
		long[][] B = new long[2][2];
		
		if(p<=1) return p;
		p--;
		while(p>0) {
			if(p%2==1) {
				MatMul(S, A, B); MatCopy(B, S);
			}
			p /= 2;
			MatMul(A, A, B); MatCopy(B, A);
		}
		return(S[0][0]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(); sc.close();
		System.out.println(Fibo(N));
	}
}
