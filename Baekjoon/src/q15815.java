import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//����ǥ��� ���� 1. ��ȣ�� ����. 2. ��ǻ�ʹ� 2�������� �ϱ⶧���� ����.
public class q15815 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				s.push(Character.getNumericValue(ch));
			} else {
				int n1 = s.pop(), n2 = s.pop();
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
		
		System.out.println(s.pop());
	}

}
