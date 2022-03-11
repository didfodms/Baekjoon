import java.util.Scanner;

public class q2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] cnt = new int[10];
		int abc = a*b*c; int div = 10;
		
		while(abc > 0) {
			cnt[abc%div]++;
			abc/=div;
		}

		for(int i=0; i<10; i++) {
			System.out.println(cnt[i]);
		}
		
	}

}
