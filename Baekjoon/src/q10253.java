import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10253 {
	
	static int HenryEx(int a, int b, int n) {
		while(true) {
			if(a == 1) return b;
			//1. ���� ū 1/n ã��
			n = b/a + 1;
			//2. ��� ����
			a = a*n - b;	b = b*n;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(HenryEx(a, b, 1)+"\n");
		}

		System.out.println(sb.toString());
		
	}

}
