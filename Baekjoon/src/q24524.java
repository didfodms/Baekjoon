import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q24524 {

	//s�� ���ڸ� ��󳻼� t�� ���� �� �ִ��� üũ
	static boolean check(String s, String t) {
		boolean res = false;
		
		for(int i=0; i<t.length(); i++) {
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==t.charAt(j)) 
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String T = br.readLine();

		int res = 0;
		while(check(S, T)) {
			res++;
		}
		
		System.out.println(res);
	}

}
