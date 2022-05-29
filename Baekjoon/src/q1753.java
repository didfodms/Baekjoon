import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class q1753 {

    static class Edge implements Comparable<Edge> {
        //id : ���� ��ȣ, cost : �������� �Ÿ�
        int id, cost;

        public Edge(int id, int cost){
            this.id = id;
            this.cost = cost;
        }

        //�켱���� ť�� ���� ���� ����
        @Override
        public int compareTo(Edge o){
            //������������ ���� (�ִܰŸ��� ���� ������ ������)
            return this.cost - o.cost;
        }

    }
    static int V, E, K;
    static int u, v, w;
    static int [] dist;
    static ArrayList[] adjList;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //���� ���� V, ���� ���� E, ���� ��� ��ȣ K
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        //�ִܰŸ� ���̺� �ʱ�ȭ
        dist = new int[V+1];
        for(int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        //���� ���� ����Ʈ �ʱ�ȭ
        adjList = new ArrayList[V+1];
        for(int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<Edge>();
        }

        //���� ���� ����Ʈ �Է�
        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            adjList[u].add(new Edge(v, w));
        }

        //���ͽ�Ʈ�� �˰��� ����
        dijkstra(K);

        //���
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= V; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            }
            else {
                sb.append(dist[i]+"\n");
            }
        }

        System.out.println(sb.toString().trim());

    }

    static void dijkstra(int start) {

        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        //�ڱ� �ڽŰ��� �Ÿ��� 0
        dist[start] = 0;
        //�켱���� ť�� ����, �ڽŰ��� �Ÿ��� ����
        pq.add(new Edge(start, 0));

        while(!pq.isEmpty()) {
            Edge cur = pq.poll();

            //dist�� ����Ǿ� �ִ°� �ִ� ��ΰ� ������ continue
            if(cur.cost > dist[cur.id]) {
               continue;
            }

            //�ƴ϶�� cur�� ����Ǿ� �ִ� ��� ������ ���̿����� �ִ� ��θ� ������
            for(int i = 0; i < adjList[cur.id].size(); i++) {
                Edge next = (Edge)adjList[cur.id].get(i);
                //���� �ִ� ����� ������ �����ϰ� pq�� �ֱ�
                if(dist[next.id] > cur.cost + next.cost) {
                    dist[next.id] = cur.cost + next.cost;
                    pq.add(new Edge(next.id, dist[next.id]));
                }
            }
        }

    }

}
