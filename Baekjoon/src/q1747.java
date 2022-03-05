import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1747 {

	static int PN = 0; //�Ҽ�&&�Ӹ���� ����
	static int[] A = new int[2000000]; //�Ҽ�&&�Ӹ���� ����
	static boolean[] isPrime = new boolean[2000000];
	
	static boolean isPalin(int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		
		String str = sb.reverse().toString();
		if(n == Integer.parseInt(str)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		//�����佺�׳׽��� ü, �Ҽ� ä���
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		for(int i=2; i<isPrime.length; i++) {
			if(isPrime[i]) {
				if(isPalin(i)) A[PN++] = i;
				
				for(int j=i+i; j<isPrime.length; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		int i = 0;
		for(i = 0; i<PN; i++) {
			if(N <= A[i]) {
				break;
			}
		}
		
		System.out.println(A[i]);
	}

}
