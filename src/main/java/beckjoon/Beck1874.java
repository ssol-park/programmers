package beckjoon;

import java.util.Scanner;
import java.util.Stack;

public class Beck1874 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        int num = 1;
        boolean result = true;

        for (int i = 0; i < N; i++) {

            int su = array[i];

            if(su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }

                stack.pop();

            }else {
                int n = stack.pop();

                if(su < n) {
                    System.out.println("NO");
                    result = false;
                    break;
                }

            }
            sb.append("-\n");
        }

        if(result) System.out.println(sb.toString());
    }
}
