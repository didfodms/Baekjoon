
public class Perm {

	static int N, K;
	static void Proc(int[] t) {
		for(int i=0; i<K; i++)
			System.out.print(t[i]+" ");
		System.out.println();
	}

	
	static void Perm(int[] t, int loc) {
		if(loc == K)
			Proc(t);
		else {
			for(int i=loc; i<N; i++) {
				int p = t[loc]; t[loc] = t[i]; t[i] = p;
				Perm(t, loc+1);
				p = t[loc]; t[loc] = t[i]; t[i] = p;
			}
		}
	}
	
	public static void main(String[] args) {
		N = 5; K = 2;
		int[] A = new int[N];
		for(int i=0; i<N; i++) A[i] = i;
		Perm(A, 0);
	}
}
