import java.util.Scanner;

public class q10953{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String res = "";
        for(int i=0; i<t; i++){
        	String[] A = sc.next().split(",");
        	res += (Integer.parseInt(A[0])+Integer.parseInt(A[1]))+"\n";
        }
        sc.close();
        System.out.println(res);
    }
}
