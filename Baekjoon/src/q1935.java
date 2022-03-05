import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class q1935 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] num = new int[27];
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Double> s = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				s.push((double)num[ch-65]);
			}
			else {
				double n1 = s.pop(), n2 = s.pop();
				
				switch(ch) {
				case '+' :
					s.push(n2+n1); break;
				case '-' :
					s.push(n2-n1); break;
				case '*' :
					s.push(n2*n1); break;
				case '/' :
					s.push(n2/n1); break;
				}
			}
			
		}
		
		//System.out.println((int)(s.pop()*100)/100.0);
		//System.out.println(Math.round(s.pop()*100)/100.0);
		System.out.printf("%.2f", s.pop());
	}

}
