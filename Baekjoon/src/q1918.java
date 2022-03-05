import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class q1918 {
	
	static int in(char c) {
		if(c=='+' || c=='-') return 2;
		if(c=='*' || c=='/') return 3;
		if(c=='(') return 4; //들어올땐 우선순위 가장 높음
		return 0;
	}
	
	static int out(char c) {
		if(c=='+' || c=='-') return 2;
		if(c=='*' || c=='/') return 3;
		if(c=='(') return 1; //나갈땐 우선순위 가장 낮음
		return 0;
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		char ch = ' ';
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				sb.append(ch);
			}
			else if(ch==')'){
				while(s.peek()!='(') {
					sb.append(s.pop());
				}
				s.pop(); //'('를 stack에서 pop!
			}
			else {
				while(!s.isEmpty() && out(s.peek())>=in(ch)) {
					sb.append(s.pop());
				}
				s.push(ch);
			}
		}
		
		while(!s.isEmpty()) {
			sb.append(s.pop());
		}
		
		System.out.println(sb.toString());
	}

}
