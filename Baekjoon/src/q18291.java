
public class q18291 {
	static long mypow(int x, int y) {
		long ss = 1;
		for(int i=0; i<y; i++)
			ss *= x;
		return ss;
	}
	
	static long fastpow(int x, int y) {
		long ss =1;
		while (y>0) {
			if(y%2==1)
				ss *= x;
			x *= x;
			y = y >> 1;
		}
		return ss;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<10; i++)
			System.out.println(mypow(7,i)+" "+fastpow(7,i));
	}
}
