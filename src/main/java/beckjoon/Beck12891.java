package beckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beck12891 {
    static int[] checkArr = new int[4];
    static int[] myArr = new int[4];
    static int checkSecret = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken()); // dna 문자열 길이
        int p = Integer.parseInt(st.nextToken()); // 부분 문자열 길이
        int result = 0;

        char[] sArr = br.readLine().toUpperCase().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) checkSecret++;
        }

        for (int i = 0; i < p; i++) {
            add(sArr[i]);
        }

        if(checkSecret == 4) result++;

        for (int i = p; i < s; i++) {
            int j = i - p;
            add(sArr[i]);
            remove(sArr[j]);

            if(checkSecret == 4) result++;
        }

        System.out.println(result);
    }

    private static int getIdxByChar(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
        }
        return -1;
    }
    private static void remove(char c) {
        int idx = getIdxByChar(c);

        if(idx == -1) return;

        if(checkArr[idx] == myArr[idx]) checkSecret--;
        myArr[idx]--;
    }

    private static void add(char c) {
        int idx = getIdxByChar(c);

        if(idx == -1) return;

        myArr[idx]++;
        if(checkArr[idx] == myArr[idx]) checkSecret++;
    }
}
