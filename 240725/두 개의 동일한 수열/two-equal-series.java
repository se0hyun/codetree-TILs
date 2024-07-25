import java.io.*;
import java.util.*;
public class Main {
    public static String equal(int[] A, int[] B, int n){
        for (int i = 0; i < n; i++){
            if (A[i] != B[i]) {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] stringA = br.readLine().split(" ");
        String[] stringB = br.readLine().split(" ");

        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++){
            A[i] = Integer.parseInt(stringA[i]);
            B[i] = Integer.parseInt(stringB[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);
        System.out.print(equal(A, B, n));

    }
}