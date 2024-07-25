import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.print(squareSum(N));
    }

    public static int squareSum(int N){
        if(N < 10) return N * N;

        int len = (int)(Math.pow(10,(int)(Math.log10(N))));
        int res = (N / len);
        // System.out.println(N);
        // System.out.println((int)(Math.pow(10,(int)(Math.log10(N)))));
        // System.out.println(res);
        return squareSum(N - (len * res)) + (res * res);
    }   
}