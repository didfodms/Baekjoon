import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1557 {

	static int NN = 0; //ㄴㄴ제곱수 개수
	static long[] A = new long[100000000];
	//ㄴㄴ제곱수 = isNN
	static boolean[] isNN = new boolean[100000000];
	
	static boolean isSq(int n) {
		int sqrt = (int)Math.sqrt(n);
		
		if(n == Math.pow(sqrt, 2)) {
			return true;
		} else return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//K의 범위는 1000000000..
		//에라토스테네스 응용 문제
		int K = Integer.parseInt(br.readLine());
		
		Arrays.fill(isNN, true);
		A[NN++] = 1;
		for(int i=2; i<isNN.length; i++) {
			if(isSq(i)){
				for(int j=i; j<isNN.length; j+=i) {
					isNN[j] = false;
				}
			}
			else if(isNN[i]) {
				A[NN++] = i;
			}
		}

		System.out.println(A[K-1]);
	}

}
