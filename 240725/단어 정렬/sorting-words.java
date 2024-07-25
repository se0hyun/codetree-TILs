import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String word = br.readLine();
            words.add(word);
        }
        Collections.sort(words);
        for (String word: words){
            System.out.println(word);
        }
    }
}