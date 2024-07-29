import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num_humans = new int[n];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            num_humans[i] = Integer.parseInt(st.nextToken());
        }

        int min_sum = 0;
        for (int i = 0; i < n; i++){    // i: 모임하는 집 index
            int sum = 0;
            for (int j = 0; j < n; j++){    // j: 계산용 집 index
                sum += Math.abs(j - i) * num_humans[j];
            }
            // System.out.println(sum);
            if (i == 0) min_sum = sum;
            else min_sum = Math.min(sum, min_sum);
        }

    System.out.print(min_sum);
    }
}