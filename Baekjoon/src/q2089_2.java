import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2089_2 { //������ ���� ����ؼ� Ǯ�� (�����..)

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//10���� -> -2����
		//������ ���� Ȱ�� -> a % b = r
		//(a+b)%c = (a%c + b%c) % c
		//(a*b)%c = (a%c * b%c) % c
		//(a-b)%c = (a%c - b%c + c) % c �������� -�� ������ �ȵǴϱ�!
		
		int r = 0;
		while(N > 0) {
			r = N % (-2)
		}
	}

}
