import java.util.Scanner;
 
public class Main {
 
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();	// 정적타입으로 해주어야한다.
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		// 마지막에 한 번에 출력
		System.out.println(sb);
 
	}
 
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
 
}