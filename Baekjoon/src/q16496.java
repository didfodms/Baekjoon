import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q16496 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1+o2;	String s2 = o2+o1;
				return s2.compareTo(s1);	//내림 차순
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String i: arr) {
			sb.append(i);
		}
		
		boolean zero = true;	//다 0이라면 0만 출력해야하기 때문에 체크
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)!='0') {
				zero = false;
				break;
			}
		}
		//왜 안되는지 몰겠음
		//System.out.println(Integer.parseInt(sb.toString()));
		if(zero) System.out.println(0);
		else System.out.println(sb.toString());
	}

}
