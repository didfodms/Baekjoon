import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q10799 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		boolean open = false;
		int stick = 0, sum = 0;
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]=='(') {
				stick++;
				open = true;
			}
			else if(open && ch[i]==')') {
				stick--;
				sum += stick;
				open = false;
			}
			else {
				stick--;
				sum++;
			}
			
		}
		
		System.out.println(sum);
	}

}
