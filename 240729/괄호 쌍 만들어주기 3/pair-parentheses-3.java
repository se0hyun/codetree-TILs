import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();

        char[] chars = A.toCharArray();
        int len = chars.length;

        int cnt = 0;
        for (int i = 0; i < len; i++){
            if (chars[i] == ')') continue;
            for (int j = 0; j < len; j++){
                if (j <= i) continue;
                else if (chars[j] == ')') cnt++;
            }
        }
        System.out.print(cnt);
    }
}