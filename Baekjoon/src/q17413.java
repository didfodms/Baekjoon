import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q17413 {
	
	static String Reverse(String str) {
		String[] arr = str.split(" ");
		String res = "";
		for(String s : arr) {
			res += new StringBuilder(s).reverse().append(" ").toString();
		}
		return res.trim();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] ch = br.readLine().toCharArray();
		boolean tag = false;
		String str = "";
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='<') {
				sb.append(Reverse(str));
				str = "";
				tag = true;
				sb.append(ch[i]);
			}
			else if(!tag && ch[i]==' ') {
				sb.append(Reverse(str)+" ");
				str = "";
			}
			else if(ch[i]=='>') {
				tag = false;
				sb.append(ch[i]);
			}
			else if(tag) {
				sb.append(ch[i]);
			}
			else if(!tag) {
				str += ch[i];
			}
		}
		sb.append(Reverse(str));
		System.out.println(sb.toString().trim());
	}
}
