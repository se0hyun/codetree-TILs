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

        int ans = 0;
        boolean wasFirst = arrA[1] > arrB[1];
        for(int k = 2; k < Math.min(idxA, idxB); k++){
            boolean isFirst = arrA[k] > arrB[k];
            if (isFirst != wasFirst){
                ans++;
            }
            wasFirst = isFirst;
        }
        // while(arrA[k] > 0){
        //     if(((arrA[k-1] - arrB[k-1]) * (arrA[k+1] - arrB[k+1])) < 0){    // 같이 선두를 달리다가 바뀔 수 있음
        //         ans++;
        //         System.out.print(k);
        //     } 
        //     k++;
        // }
        System.out.print(ans);
    }
}