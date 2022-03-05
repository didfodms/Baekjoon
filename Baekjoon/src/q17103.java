import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q17103 {
	//�������� ���� : 2���� ū ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִ�.
	//�Ҽ� ����? -> �����佺�׳׽��� ü!!
	static int PN = 0; //�Ҽ� ����
	static int[] A = new int[1000000];
	static boolean[] isPrime = new boolean[1000000];
	
	static int countGold(int n) {
		int res = 0;
		for(int i=2; i+i<=n; i++) {
			if(isPrime[i] && isPrime[n-i]) res++;
		}
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		
		//�����佺�׳׽��� ü ä���
		//�Ҽ��� ���� true
		for(int i=2; i<1000000; i++) {
			if(isPrime[i] == true) {
				A[PN++] = i;
				for(int j=i+i; j<1000000; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			sb.append(countGold(N)+"\n");
		}
		
		System.out.println(sb.toString().trim());

	}

}
