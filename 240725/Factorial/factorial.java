import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fact(N));

    }
    public static int fact(int N){
        if (N==0) return 1;

        return fact(N-1) * N;
    }
}