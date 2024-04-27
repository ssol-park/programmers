package beckjoon.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beck11659 {

    public  static  void test() {

        int n = 5;
        int m = 3;

        int[] arrays = {5, 4, 3, 2, 1};

        int[] sumArrays = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            sumArrays[i] = sumArrays[i - 1] + arrays[i - 1];
        }

        System.out.println(Arrays.toString(sumArrays));

        int start = 3;
        int end = 5;
        System.out.println("result : " + (sumArrays[end] - sumArrays[start - 1]));
    }
    public static void main(String[] args) throws IOException {
        test();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println(" >>> input n, m Ex) 1 3");
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        System.out.println("n = " + m + " / m = " + m);
//
//        int[] originArray = new int[n];
//        int[] sumArray = new int[n + 1];
//        st = new StringTokenizer(br.readLine());
//
//        for (int i = 1; i <= n; i++) {
//            int inputNum = Integer.parseInt(st.nextToken());
//
//            originArray[i - 1] = inputNum;
//            sumArray[i] = sumArray[i - 1] + inputNum;
//        }
//
//        System.out.println("sumArray = " + Arrays.toString(sumArray));
//        System.out.println("originArray = " + Arrays.toString(originArray));
//
//        for (int i = 0; i < m; i++) {
//            System.out.println(" >>> input start, end Ex) 1 3");
//
//            st = new StringTokenizer(br.readLine());
//
//            int start = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
//
//            System.out.println(sumArray[end] - sumArray[start - 1]);
//        }
//
//        System.out.println("END...");
    }




    /* solved
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());

    int n=Integer.parseInt(st.nextToken());
    int m=Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    int[] sumArray = new int[n + 1];

        for (int i = 1; i <= n; i++) {
        sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
    }

        for (int i = 0; i < m; i++) {
        st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        System.out.println(sumArray[end] - sumArray[start - 1]);
    }*/
}
