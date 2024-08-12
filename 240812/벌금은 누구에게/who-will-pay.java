import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] punish = new int[M];
        int[] nums = new int[N + 1];
        nums[0] = 0;
        int i = 0;

        while (M > 0){
            punish[i] = Integer.parseInt(br.readLine());
            nums[punish[i]]++;
            if (nums[punish[i]] >= K){
                System.out.print(punish[i]);
                break;
            }
            M--; i++;
            if(M == 0){
                System.out.print(-1);
                break;
            }
        }



    }
}