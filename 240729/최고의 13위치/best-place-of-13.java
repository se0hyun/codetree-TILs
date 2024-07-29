import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max_sum = 0;

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N - 2; j++){
                int sum = 0;
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                max_sum = Math.max(sum, max_sum);
            }
        }
        System.out.println(max_sum);
    }
}