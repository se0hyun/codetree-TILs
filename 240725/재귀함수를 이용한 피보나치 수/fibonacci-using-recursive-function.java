import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibo(N));
    }

    public static int fibo(int N){
        if(N == 1) return 1;
        else if (N == 2) return 1;
        return fibo(N - 1) + fibo(N - 2);
    }
}