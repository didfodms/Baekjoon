import java.util.Scanner;

public class q9950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) break;
			
			String res = "";

			if(a!=0) {
				res = a+" ";
			} else {
				res = c/b+" ";
			}
			
			if(b!=0) {
				res += b+" ";
			} else {
				res += c/a+" ";
			}
			
			if(c!=0) {
				res += c;
			} else {
				res += a*b;
			}
			
			System.out.println(res);

		}
		sc.close();
	}

}
