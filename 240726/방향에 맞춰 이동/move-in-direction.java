import java.util.*;
import java.io.*;
public class Main {
    // 동 서 남 북
    public static int[] dx = new int[]{1, -1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());

            switch(dir){
                case 'E':
                    x += dx[0] * dis;
                    break;
                case 'W':
                    x += dx[1] * dis;
                    break;
                case 'S':
                    y += dy[2] * dis;
                    break;
                case 'N':
                    y += dy[3] * dis;
                    break;
            }
        }
        System.out.println(x + " " + y);
    }
}