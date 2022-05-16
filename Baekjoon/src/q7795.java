import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class q7795 {
    //A의 원소 > B의 원소인 경우 리턴
    static int BinarySearch(int target, int[] arr){

        int count = 0;
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {

            int mid = (start + end)/2;

            if(arr[mid] < target) {
                count = mid + 1;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return count;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {

            int count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] A = new int[n];
            int[] B = new int[m];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(B);

            int result = 0;
            for(int i=0; i<A.length; i++){
                result += BinarySearch(A[i], B);
            }

            sb.append(result+"\n");

        }

        System.out.println(sb.toString().trim());

    }

}
