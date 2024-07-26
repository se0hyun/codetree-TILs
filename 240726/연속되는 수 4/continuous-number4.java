import java.util.*;
import java.io.*;
public class Main {
    public static int MAX_N = 1000;
    public static int[] arr = new int[MAX_N];
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 1, ans = 0;
        for (int i = 0; i < N; i++){
            if (i >= 1 && arr[i] > arr[i-1])
                cnt++;
            else
                cnt = 1;
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }
}