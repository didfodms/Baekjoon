import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1212 {
	//8진수 -> 2진수
	//숫자 하나씩 받고 세자리 문자열로 넘기기
	static String to2(int n) {
		StringBuilder sb = new StringBuilder();
		int r = 0;
		
		while(n != 0) {
			r = n % 2;
			n /= 2;
			sb.append(r);
		}
		
		while(sb.length()!=3) {
			sb.append(0);
		}

		return sb.reverse().toString();
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			sb.append(to2(Character.getNumericValue(str.charAt(i))));
		}
		
		if(str.equals("0")) {
			System.out.println("0");
		} else {
			System.out.println(sb.toString().replaceFirst("^0{1,}", ""));
		}
	}

}
