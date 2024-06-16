package beckjoon.important;

import java.util.Scanner;

/*
* Beck1929
* */
public class Minority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] numbers = new int[m + 1];

        for (int i = 2; i <= m; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(m); i++) {
            if(numbers[i] == 0)
                continue;

            for (int j = i + i; j <= m; j = j + i) {
                numbers[j] = 0;
            }
        }

        for (int i = n; i <= m; i++) {
            if(numbers[i] != 0)
                System.out.println(numbers[i]);
        }
    }
}
