import java.util.Scanner;

public class q2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		sc.close();
		
		int date = (v-a)/(a-b);
		
		System.out.println(date);
	}
}
