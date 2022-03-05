import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1676 {
	
	static int cnt(int n) { //n�� ���μ� �����ؼ� 5�� ���� ���� (2�� ������ �׻� �� ���� ����)
		int cnt = 0;
		int i = 2;
		while(n>1) {
			if(n%i==0) {
				if(i==5) cnt++;
				n /= i;
			} else i++;
		}
		return cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int cnt5 = 0;
		for(int i=2; i<=N; i++) { //���丮�� ���μ�����
			cnt5 += cnt(i);
		}
		
		System.out.println(cnt5);
	}

}
