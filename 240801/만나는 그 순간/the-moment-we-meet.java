import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_T = 1000*1000
    public static final int[] stA = new int[MAX_T];
    public static final int[] stB = new int[MAX_T];
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int timeA = 1;
        for (int i = 0; i < N; i++){
            StringTokenizer A = new StringTokenizer(br.readLine());
            char d = A.nextToken().charAt(0);
            int t = Integer.parseInt(A.nextToken());

            while(t-- > 0){
                if(d == 'R') stA[timeA] = stA[timeA - 1] + 1;
                else stA[timeA] = stA[timeA - 1] - 1;
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < M; i++){
            StringTokenizer B = new StringTokenizer(br.readLine());
            char d = B.nextToken().charAt(0);
            int t = Integer.parseInt(B.nextToken());

            while(t-- > 0){
                if(d == 'R') stB[timeB] = stB[timeB - 1] + 1;
                else stB[timeB] = stB[timeB - 1] - 1;
                timeB++;
            }
        }

        int answer = -1;
        for(int i = 1; i < timeA; i++){
            if(stA[i] == stB[i]){
                answer = i;
                break;
            }
        }
        System.out.print(answer);

    }
}