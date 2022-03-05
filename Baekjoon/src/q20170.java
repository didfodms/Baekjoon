import java.util.Scanner;

public class q20170 {
	static String reduceF(int a, int b) {
		String res = a+"/"+b;
		StringBuilder sb = new StringBuilder();
		for(int i=a; i>0; i--) {
			if(a%i==0&&b%i==0) {
				res = (a/i)+"/"+(b/i);
				return res;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int d1[] = new int[6];
		int d2[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<6; i++) d1[i] = sc.nextInt();
		for(int i=0; i<6; i++) d2[i] = sc.nextInt();
		sc.close();
		//분모 denominator
		//분자 numerator
		int deno = 6*6, numer = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(d1[i]>d2[j]) numer++;
			}
		}
		
		System.out.println(reduceF(numer, deno));
	}

}
