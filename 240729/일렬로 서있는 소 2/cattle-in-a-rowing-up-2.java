import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] height = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            height[i] = Integer.parseInt(st.nextToken());
            // System.out.print(height[i]);
        }

        int cnt = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if ((j <= i) || (height[j] < height[i])) continue;
                for (int k = 0; k < N; k++){
                    if ((k <= j) || (height[k] < height[j])) continue;
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}