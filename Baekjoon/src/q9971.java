import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q9971 {

	static String change(String s) {
		//65~ 90 аж╠Б.
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			
			ch = (char)(65 + (((int)ch - 65) + 21) % 26);
			sb.append(ch);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			input = br.readLine();
			if(input == "ENDOFINPUT") break;
			
			sb.append(change(br.readLine())+"\n");
			input = br.readLine();
		}
		
		System.out.println(sb.toString().trim());
	}

}
