import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            if(st.hasMoreTokens()){
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr);
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n-1; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}