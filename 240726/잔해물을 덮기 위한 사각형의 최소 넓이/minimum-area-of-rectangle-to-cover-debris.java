import java.io.*;
import java.util.*;

public class Main {
    public static int OFFSET = 1000;
    public static int MAX_R = 2000;
    
    public static int[] x1 = new int[2];
    public static int[] y1 = new int[2];
    public static int[] x2 = new int[2];
    public static int[] y2 = new int[2];

    public static int[][] checked = new int [MAX_R][MAX_R];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            x2[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y2[i] = Integer.parseInt(st.nextToken()) + OFFSET;
        }
        for (int x = x1[0]; x < x2[0]; x++)
            for (int y = y1[0]; y < y2[0]; y++){
                checked[x][y]++;
                area++;
            }
        for (int x = x1[1]; x < x2[1]; x++)
            for (int y = y1[1]; y2[1]; y++){
                if(checked[x][y] == 1){
                    area--;
                }
            }
        System.out.print(area);
    }
}