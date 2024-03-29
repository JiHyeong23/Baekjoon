import java.util.*;
import java.io.*;

public class Main {
    static int n,m,cnt;
    //몇번째 방문인지
    public static int[] visted;
    //연결된 노드
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());

        for(int i=0;i<n+1;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int i=0;i<graph.size();i++){
            Collections.sort(graph.get(i));
        }
        cnt=1;
        visted= new int[n+1];
        dfs(r);
        for(int i=1;i<visted.length;i++){
            System.out.println(visted[i]);
        }
    }
    public static void dfs(int x){
        visted[x]=cnt;
        for(int i=0;i<graph.get(x).size();i++){

            int y = graph.get(x).get(i);
            if(visted[y]==0){
                cnt++;
                dfs(y);
            }
        }
    }
}