import java.util.*;
import java.io.*;

public class Main {
    public static int[] arrA = new int[1000*1000];
    public static int[] arrB = new int[1000*1000];
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());    
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int idxA = 1;
        int idxB = 1;

        for(int i = 0; i < N; i++){
            StringTokenizer stA = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stA.nextToken());
            int t = Integer.parseInt(stA.nextToken());

            for(int j = idxA; j < t + idxA; j++){
                arrA[j] = arrA[j - 1] + v;
            }
            idxA += t;
        }

        for(int i = 0; i < M; i++){
            StringTokenizer stB = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stB.nextToken());
            int t = Integer.parseInt(stB.nextToken());

            for(int j = idxB; j < t + idxB; j++){
                arrB[j] = arrB[j - 1] + v;
            }
            idxB += t;
        }
        int leader = 0, ans = 0;
        for (int i = 1; i < idxA; i++){
            if(arrA[i] > arrB[i]){
                if(leader == 2)
                    ans++;
                leader = 1;
            }
            else if(arrA[i] < arrB[i]){
                if(leader == 1)
                    ans++;
                leader = 2;
            }   
        }

        System.out.print(ans);
    }
}