import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static boolean inRange(int n, int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0, ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                cnt = 0;
                for (int dirNum = 0; dirNum < 4; dirNum++){
                    int nx = i + dx[dirNum], ny = j + dy[dirNum];
                    if(inRange(n, nx, ny) && arr[nx][ny] == 1)
                        cnt++;
                }   
                if (cnt >= 3)
                    ans++;
            }
        }
        System.out.print(ans);

    }
}