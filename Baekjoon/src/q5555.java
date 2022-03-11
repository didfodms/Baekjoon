import java.util.Scanner;

public class q5555 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		String str;
		int n = sc.nextInt();
		int res = 0;
		
		while(n-- > 0) {
			str = sc.next();
			str += str;
			
			if(str.indexOf(ss) >= 0) res++;
		}
		
		System.out.println(res);
	}

}
