import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class q1753 {

    static class Edge implements Comparable<Edge> {
        //id : 정점 번호, cost : 정점간의 거리
        int id, cost;

        public Edge(int id, int cost){
            this.id = id;
            this.cost = cost;
        }

        //우선순위 큐의 정렬 기준 정의
        @Override
        public int compareTo(Edge o){
            //오름차순으로 정렬 (최단거리가 가장 앞으로 가도록)
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
        //정점 개수 V, 간선 개수 E, 시작 노드 번호 K
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        //최단거리 테이블 초기화
        dist = new int[V+1];
        for(int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        //인접 정점 리스트 초기화
        adjList = new ArrayList[V+1];
        for(int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<Edge>();
        }

        //인접 정점 리스트 입력
        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            adjList[u].add(new Edge(v, w));
        }

        //다익스트라 알고리즘 수행
        dijkstra(K);

        //출력
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
        //자기 자신과의 거리는 0
        dist[start] = 0;
        //우선순위 큐에 먼저, 자신과의 거리를 넣음
        pq.add(new Edge(start, 0));

        while(!pq.isEmpty()) {
            Edge cur = pq.poll();

            //dist에 저장되어 있는게 최단 경로가 맞으면 continue
            if(cur.cost > dist[cur.id]) {
               continue;
            }

            //아니라면 cur에 연결되어 있는 모든 정점들 사이에서의 최단 경로를 갱신함
            for(int i = 0; i < adjList[cur.id].size(); i++) {
                Edge next = (Edge)adjList[cur.id].get(i);
                //더욱 최단 경로인 것으로 갱신하고 pq에 넣기
                if(dist[next.id] > cur.cost + next.cost) {
                    dist[next.id] = cur.cost + next.cost;
                    pq.add(new Edge(next.id, dist[next.id]));
                }
            }
        }

    }

}
