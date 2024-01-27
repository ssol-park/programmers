package beckjoon;

import java.util.Scanner;

public class Beck1546 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double arr[] = new double[in.nextInt()];
        double max = 0;
        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();

            if(max < arr[i]) max = arr[i];

            sum += arr[i];
        }

        System.out.println((((sum * 100) / max) / arr.length));
    }
}
