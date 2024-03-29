import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        if(n == 4 || n == 7) result = -1;
        else if(n%5 == 0) result = n/5;

        else if(n%5 == 1) result = ( (n-6)/5 ) +2 ; // 21-6= 15/5 = 3 + 2 = 5
        else if(n%5 == 2) result = ( (n-12)/5 ) +4;
        else if(n%5 == 3) result = ( (n-3)/5 ) +1;
        else if(n%5 == 4) result = ( (n-9)/5 ) +3;

        System.out.println(result);
    }
}