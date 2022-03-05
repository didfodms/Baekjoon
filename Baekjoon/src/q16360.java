import java.util.Scanner;

public class q16360 {

	static String la(String s) {
		int len = s.length();
		switch(s.charAt(len-1)) {
			case 'a':	case 'o':	case 'u':
				s += "s";
				break;
			case 'l':	case 'v':	case 'r':
				s += "es";
				break;
			case 't':	case 'w':
				s += "as";
				break;
			case 'i':	case 'y':
				s = s.substring(0, len-1) + "ios";
				break;
			case 'n':
				s = s.substring(0, len-1) + "anes";
				break;
			case 'e':
				if(s.charAt(len-2)=='n')
					s = s.substring(0, len-2) + "anes";
				else s += "us";
				break;
			default :
				s += "us";
				break;
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] s = new String[t];
		for(int i=0; i<t; i++) s[i] = sc.next();
		sc.close();
		for(int i=0; i<t; i++) System.out.println(la(s[i]));
	}

}
