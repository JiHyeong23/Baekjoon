import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] arr = new int[9][9];

        for(int i = 0; i < 9; i++) {
            String[] strArr = br.readLine().split(" ");
            for( int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        int max = 0;
        int row = 0;
        int culnm = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    row = i+1;
                    culnm = j+1;
                } else continue;
            }
        }

        System.out.println(max);
        System.out.println(row + " " + culnm);
    }
}