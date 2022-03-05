import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q19532 {

	public static void main(String[] args) throws Exception {

        //create instance
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //input
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //cal1, y 소거
        int x = (c*e-f*b)/(a*e-d*b);
        int y = (c*d-f*a)/(b*d-a*e);
        //출력
        System.out.println(x+" "+y);

    }

}
