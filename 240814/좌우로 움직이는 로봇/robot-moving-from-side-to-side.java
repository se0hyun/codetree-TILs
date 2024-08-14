import java.util.*;
import java.io.*;

public class Main {
    public static int idxA = 1;
    public static int idxB = 1;
    public static int getDir(char c){
        if (c == 'R') return 1;
        else return -1;
    }
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        arrA.add(0);
        arrB.add(0);

        while(n > 0){
            StringTokenizer stA = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(stA.nextToken());
            char d = stA.nextToken().charAt(0);
            for (int i = idxA; i < idxA+t; i++){
                arrA.add(arrA.get(i-1)+getDir(d));
            }
            idxA += t;
            n--;
        }

        while(m > 0){
            StringTokenizer stB = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(stB.nextToken());
            char d = stB.nextToken().charAt(0);
            for (int i = idxB; i < idxB+t; i++){
                arrB.add(arrB.get(i-1)+getDir(d));
            }
            idxB += t;
            m--;
        }
        // System.out.println(arrA.subList(375, 400));
        // System.out.println(arrA.size());
        // System.out.println(arrB.size());

        if(idxA >idxB){
            for(int i = idxB; i < idxA; i++){
                arrB.add(arrB.get(idxB - 1));
            }
        }else if(idxA < idxB){
            for(int i = idxA; i < idxB; i++){
                arrA.add(arrA.get(idxA - 1));
            }
        }
        // System.out.println(arrA.subList(12788, 12800));
        // System.out.println(arrB.subList(12788, 12800));
        // System.out.println(arrA);
        // System.out.println(arrB);

        int wasSame = 1, ans = 0; // 마주치면 1, 아니면 0
        for (int i = 1; i < Math.max(idxA, idxB); i++){
            // if (arrA.get(i).equals(arrB.get(i)) && !arrA.get(i-1).equals(arrB.get(i-1))){   // == 으로 하면 첫번째만 체크함.
            if(arrA.get(i).equals(arrB.get(i))){
                if (wasSame == 0){
                    // System.out.println(i);
                    ans++;
                    wasSame = 1;
                }
            }
            else
                wasSame = 0;
        }
        System.out.print(ans);
    }
}

// 0, -1, -2, -3, -2, -1, 0, 1, 2, 1, 2, 3
// 0,  1,  2,  3,  4,  3, 2, 1, 0, 1, 2, 3, 4, 3, 2

// 0, -1, -2, -3, -2, -1, 0, 1, 2, 1, 2, 3, 3, 3, 3, 3
// 0,  1,  2,  3,  4,  3, 2, 1, 0, 1, 2, 3, 4, 3, 2

// 0, -1, -2, -3, -2, -1, 0, 1, 2, 1, 2, 3, 3, 3, 3
// 0,  1,  2,  3,  4,  3, 2, 1, 0, 1, 2, 3, 4, 3, 2