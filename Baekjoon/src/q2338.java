import java.math.BigInteger;
import java.util.Scanner;

public class q2338 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		sc.close();
		
		System.out.println(A.add(B)+"\n"+A.subtract(B)+"\n"+A.multiply(B));
	}

}
