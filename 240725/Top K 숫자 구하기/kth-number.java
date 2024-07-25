import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] numsS = br.readLine().split(" ");
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(numsS[i]);
        }
        Arrays.sort(nums);
        System.out.print(nums[k-1]);
    }
}