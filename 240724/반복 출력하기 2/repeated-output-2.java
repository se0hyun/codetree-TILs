import java.util.*;
import java.io.*;

public class Main {
    public static void printHelloWorld(int N){
            if (N == 0){
                return;
            }
            printHelloWorld(N - 1);
            System.out.println("HelloWorld");
        }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        printHelloWorld(N);
        
    }
}