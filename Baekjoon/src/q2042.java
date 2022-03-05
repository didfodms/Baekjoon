
class SegLong{
	static int N;
	static long[] stree;
	
	SegLong(long[] a, int n){
		N = n;
		int h = (int)Math.ceil(Math.log((double) N)/Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
		Build(a, 0, 0, N-1);
	}
	SegLong(int n){
		N = n;
		int h = (int)Math.ceil(Math.log((double) N)/Math.log(2.0));
		int t = 1 << (h+1);
		stree = new long[t];
	}
	
	void Build(long[] a, int index, int start, int end) {
		if(start == end) stree[index] = a[start];
		else { 
			int mid = (start+end) >> 1;
			Build(a, index*2+1, start, mid);
			Build(a, index*2+2, mid+1, end);
			stree[index] = stree[index*2+1]+stree[index*2+2];
		}
	}
	
	void Update (int oid, long amt, int sid, int start, int end) {
		if (oid<start || oid>end) return;
		if (start != end) {
			Update(oid, amt, sid*2+1, start, (start+end)/2);
			Update(oid, amt, sid*2+2, (start+end)/2+1, end);
			stree[sid] = stree[sid*2+1]+stree[sid*2+2];
		}
		else stree[sid] = amt;
	}
	
	void Increase (int oid, long amt, int sid, int start, int end) {
		if(oid<start || oid>end) return;
		if(start != end) {
			Increase(oid, amt, sid*2+1, start, (start+end)/2);
			Increase(oid, amt, sid*2+2, (start+end)/2+1, end);
			stree[sid] = stree[sid*2+1] + stree[sid*2+2];
		}
		else stree[sid] += amt;
	}
	
	int Kth (long k, int sid, int start, int end) {
		int res;
		if(start == end) res = start;
		else if (stree[sid*2+1]>k)
			res = Kth(k, sid*2+!, start, (start+end)/2+1, end);
		else
			res = Kth(k-stree[sid*2+1], sid*2+2, (start+end)/2+1, end);
		return res;
	}
	
	long Query (int left, int right, int sid, int start, int end) {
		long res;
		if(left>end || right<start) res = 0;
		else if (start>=left && end<=right) res = stree[sid];
		else res = Query(left, right, sid*2+1, start, (start+end)/2) +
					Query(left, right, sid*2+2, (start+end)/2+1, end);
		return res;
	}
}

public class q2042 {

	static int[] tree = new int[1000000];
	static int[] A = new int[1000000];
	static int init(int start, int end, int node) {
		if(start==end) return tree[node] = A[start];
		int mid = (start + end) / 2;
		return tree[node] = init(start, mid, node*2) + init(mid+1, end, node*2+1);
	}
	
	static int sum(int start, int end, int node, int left, int right) {
		if(left > end || right < start) return 0;
		if(left <= start && end <= start) return tree[node];
		int mid = (start + end) / 2;
		return sum(start, mid, node*2, left, right) + sum(mid+1, end, node*2+1, left, right);
	}
	
	void update(int start, int end, int node, int index, int dif) {
		if(index < start || index > end) return;
		tree[node] += dif;
		if(start == end) return;
		int mid = (start + end)/2;
		update(start, mid, node*2, index, dif);
		update(mid+1, end, node*2+1, index, dif);
	}
	
	public static void main(String[] args) {
		

	}

}
