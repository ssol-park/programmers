package beckjoon.important;

import java.util.Arrays;
import java.util.Scanner;


/*
* Beck1920
* */
public class BinarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        int m = scanner.nextInt();
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int target = scanner.nextInt();
            boolean find = false;

            int start = 0;
            int end = numbers.length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                int number = numbers[mid];

                if(number > target) {
                    end = mid - 1;
                }else if(number < target) {
                    start = mid + 1;
                }else {
                    find = true;
                    break;
                }
            }

            if(find)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
/*
5
        4 1 5 2 3
        5
        1 3 7 9 5*/
