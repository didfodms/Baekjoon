import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1259 {

	static boolean isPalin(String s1) {
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		String s2 = sb.reverse().toString();
		if(s1.compareTo(s2) == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			str = br.readLine();
			if(str.equals(null) || str.equals("0")) break;
			if(isPalin(str)) {
				sb.append("yes\n");
			} else sb.append("no\n");
		}
		
		System.out.println(sb.toString());
	}
}
