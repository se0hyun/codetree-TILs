import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 0;
        System.out.println(count(N, i));
    }

    public static int count(int N, int i){
        if (N == 1) return i ;

        else if (N % 2 == 0) {
            i++;
            return count(N/2, i);
        }
        else if (N % 2 == 1){
            i++;
            return count(N/3, i);
        }
        return i;
    }
}