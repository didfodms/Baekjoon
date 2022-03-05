import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1373 {
	//2진수를 세 자리씩 끊으면 8진수를 만들 수 있다....
	
	static String to8(String de) {
		int ans = 0, m = 1;
		
		for(int i=de.length()-1; i>=0; i--) {
			int n = Character.getNumericValue(de.charAt(i));
			
			ans += n*m;
			m *= 2;
		}
		
		return Integer.toString(ans);
	}
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		
		if(str.length()%3==0) {
			
			for(int i=0; i<str.length(); i++) {
				
				temp.append(str.charAt(i));
				
				if(i%3==2) {
					sb.append(to8(temp.toString()));
					temp.setLength(0);
				}
				
			}
			
		} else if(str.length()%3==1) {
			
			temp.append(str.charAt(0));
			sb.append(to8(temp.toString()));
			temp.setLength(0);
			
			for(int i=1; i<str.length(); i++) {

				temp.append(str.charAt(i));
				
				if(i%3==0) {
					sb.append(to8(temp.toString()));
					temp.setLength(0);
				}
				
			}
			
			
		} else if(str.length()%3==2) {
			
			temp.append(str.substring(0, 2));
			sb.append(to8(temp.toString()));
			temp.setLength(0);
			
			for(int i=2; i<str.length(); i++) {

				temp.append(str.charAt(i));
				
				if(i%3==1) {
					sb.append(to8(temp.toString()));
					temp.setLength(0);
				}
				
			}
			
		}
		
		System.out.println(sb.toString());

	}

}
