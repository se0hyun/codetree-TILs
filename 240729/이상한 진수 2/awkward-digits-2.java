import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        char[] nums = N.toCharArray();
        for(int i = 0; i < N.length(); i++){
            // System.out.println(nums[i]);
            if (nums[i] == '1') continue;
            else {
                nums[i] = '1';
                break;
            }
        }
        String num = new String(nums);
        System.out.print(Integer.parseInt(num, 2));
    }
}