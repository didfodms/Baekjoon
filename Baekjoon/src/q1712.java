import java.util.Scanner;

public class q1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int n = -1;
		if(c>b) {
			n = a/(c-b);
			n++;
		}
		
		System.out.println(n);
	}
}
