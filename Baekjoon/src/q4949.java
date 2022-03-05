import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class q4949 {
	
	static String isBalance(String str) {
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '[') {
				s.push(ch);
			}
			else if(ch == ')') {
				if(s.isEmpty() || s.pop()!='(') {
					return "no";
				}
			}
			else if(ch == ']') {
				if(s.isEmpty() || s.pop()!='[') {
					return "no";
				}
			}
		}
		
		if(s.isEmpty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		StringBuilder sb = new StringBuilder();
		while(true) {
			input = br.readLine();
			if(input.equals(".")) break;
			sb.append(isBalance(input)+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}
}
