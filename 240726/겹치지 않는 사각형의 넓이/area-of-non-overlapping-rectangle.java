import java.io.*;
import java.util.*;
public class Main {
    public static int MAX_R = 2000;
    public static int OFFSET = 1000;
    public static int[] x1 = new int[3];
    public static int[] y1 = new int[3];
    public static int[] x2 = new int[3];
    public static int[] y2 = new int[3];

    public static int[][] checked = new int[MAX_R][MAX_R];

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            x2[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y2[i] = Integer.parseInt(st.nextToken()) + OFFSET;
        }
        int area = 0;
        for (int i = 0; i < 2; i++){
            for (int x = x1[i]; x < x2[i]; x++){
                for (int y = y1[i]; y < y2[i]; y++){
                    checked[x][y]++;
                    area++;
                }
            }
        }
        for (int x = x1[2]; x < x2[2]; x++){
            for (int y = y1[2]; y < y2[2]; y++){
                if(checked[x][y] > 0) {
                    checked[x][y] = 0;
                    area--;
                }
            }
        }
        System.out.print(area);
    }
}