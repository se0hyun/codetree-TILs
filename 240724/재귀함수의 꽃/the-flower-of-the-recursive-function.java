import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        count(N);
    }

    public static void count(int N){
        if (N < 1) return ;
        System.out.print(N + " ");
        count(N - 1);
        System.out.print(N + " ");
    }
}