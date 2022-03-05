import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q9954 {

//a = 97~ z = 122, A = 65~ Z = 90
	
	static String change(String str) {
		StringBuilder res = new StringBuilder();
		char c = str.charAt(str.length()-1);
		int differ = (int)c - 65;
		
		for(int i=0; i<str.length()-1; i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				if((int)ch < 65 + differ) {
					ch = (char)(91 + (int)ch - differ);
				} else {
					ch = (char)((int)ch - differ);
				}
			}
			else if(Character.isLowerCase(ch)){
				if((int)ch < 97 + differ) {
					ch = (char)(123 + (int)ch - differ);
				} else {
					ch = (char)((int)ch - differ);
				}
			}
			
			res.append(ch);
		}
		
		return res.toString();
	}
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		String input = "";
		while(true) {
			input = br.readLine();
			if(input == "#") break;
			
			sb.append(change(input));
		}
		
		System.out.println(sb.toString());
	}

}
