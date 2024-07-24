import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 1;
        printStar(N, i);
        System.out.println();
        printRevStar(N);
    }

    public static void printStar(int N, int i){
        if (N == 0) return;
        System.out.print(i + " ");
        i++;
        printStar(N - 1, i);
    }

    public static void printRevStar(int N){
        int j = N;
        if (N == 0) return;
        System.out.print(j + " ");
        j--;
        printRevStar(N - 1);
    }
}