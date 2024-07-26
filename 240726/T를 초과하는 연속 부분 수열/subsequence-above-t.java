import java.util.*;
import java.io.*;

public class Main {
    public static int MAX_N = 1000;
    public static int[] arr = new int[MAX_N];
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_ = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st_.nextToken());
        int T = Integer.parseInt(st_.nextToken());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1, ans = 0;
        for (int i = 0; i < N; i++){
            if (i >= 1 && arr[i] > T && arr[i-1] > T)
                cnt++;
            else
                cnt = 1;
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }
}