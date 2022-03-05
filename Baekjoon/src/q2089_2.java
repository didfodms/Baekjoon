import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2089_2 { //나머지 연산 사용해서 풀기 (어떻게해..)

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//10진법 -> -2진법
		//나머지 연산 활용 -> a % b = r
		//(a+b)%c = (a%c + b%c) % c
		//(a*b)%c = (a%c * b%c) % c
		//(a-b)%c = (a%c - b%c + c) % c 나머지가 -가 나오면 안되니까!
		
		int r = 0;
		while(N > 0) {
			r = N % (-2)
		}
	}

}
