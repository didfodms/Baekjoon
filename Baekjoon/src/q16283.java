import java.util.Scanner;

public class q16283 {

	public static void main(String[] args) {
		int a, b, n, w;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(); b = sc.nextInt();
		n = sc.nextInt(); w = sc.nextInt();
		sc.close();
		
		int cnt = 0, j = 0;
		for(int i=1; i<n; i++) {
			if(w==(i*a+(n-i)*b)) {
				cnt++; j = i;
			}
		}

		String res = "";
		if(cnt==1) res += j +" "+ (n-j);
		else res += -1;
		
		System.out.println(res);
	}

}
