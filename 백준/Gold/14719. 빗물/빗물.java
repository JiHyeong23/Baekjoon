import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        boolean[][] map = new boolean[height][width];

        for (int i=0; i<width; i++) {
            int block = Integer.parseInt(st.nextToken());
            for (int j=0; j<block; j++) map[height-j-1][i] = true;
        }

        int result = 0;
        for (int i=0; i<height; i++) {
            int left = 0;
            boolean flag = false;
            for (int j=0; j<width; j++) {
                if (map[i][j]) {
                    if (flag) result += j-left-1;
                    else flag = true;
                    left = j;
                }
            }
        }
        System.out.println(result);
    }
}