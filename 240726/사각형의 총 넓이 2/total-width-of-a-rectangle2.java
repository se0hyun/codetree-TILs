import java.io.*;
import java.util.*;
public class Main {
    public static final int MAX_N = 10;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int n;
    public static int[] x1 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] y2 = new int[MAX_N];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            x2[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y2[i] = Integer.parseInt(st.nextToken()) + OFFSET;
        }
        for(int i = 0; i < n; i++){
            for(int x = x1[i]; x < x2[i]; x++){
                for(int y = y1[i]; y < y2[i]; y++){
                    checked[x][y]++;
                }
            }
        }

        int area = 0;
        for(int x = 0; x <= MAX_R; x++){
            for(int y = 0; y <= MAX_R; y++){
                if(checked[x][y] > 0) area++;
            }
        }
        System.out.print(area);
        
    }
}