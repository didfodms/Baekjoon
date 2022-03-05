import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q24389 {

	static String toBit(int n) {
		StringBuilder sb = new StringBuilder();
		
		int div = 2;
		while(n > 0) {
			sb.append(n%div);
			n /= div;
		}
		
		while(sb.length()<32) {
			sb.append("0");
		}
		
		return sb.reverse().toString();
	}
	
	static String change(String d) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<d.length(); i++) {
			if(d.charAt(i)=='0') sb.append('1');
			else sb.append('0');
		}
		
		char[] res = sb.toString().toCharArray();
		int index = res.length-1;
		
		while(res[index]=='1') {
			res[index--] = '0';
		}
		res[index] = '1';
		
		sb = new StringBuilder();
		for(char ch: res) {
			sb.append(ch);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String first = toBit(N);
		String bosu = change(first);

		int cnt = 0;
		for(int i=0; i<first.length(); i++) {
			if(first.charAt(i)!=bosu.charAt(i)) cnt++;
		}
		
		System.out.println(cnt);
	}

}
