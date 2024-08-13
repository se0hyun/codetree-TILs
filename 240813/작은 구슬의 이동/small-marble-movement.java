import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{1, 0, 0, -1};

    public static int getDir(char c){
        if(c == 'R') return 0;
        else if(c == 'D') return 1;
        else if(c == 'U') return 2;
        else return 3;
    }

    public static boolean inRange(int x, int y, int n){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        // 방향 전환 및 이동에 1초 소요
        // 초기 위치, 방향, 시간

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st2.nextToken());
        int c = Integer.parseInt(st2.nextToken());
        char dir = st2.nextToken().charAt(0);

        // 입력 끝 ---------------------------------------------------------------

        int dirNum = getDir(dir);
        while(t >= 0){
            int nx = r + dx[dirNum];
            int ny = c + dy[dirNum];
            if(!inRange(nx, ny, n))
                dirNum = 3 - dirNum;

            r += dx[dirNum];
            c += dy[dirNum];
            t--;
        }    
        System.out.print(r + " " + c);        

    }
}