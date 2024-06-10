package beckjoon.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Beck1541
* */
public class GreedyImp {
    public static void main(String[] args) throws IOException {
        /*
         * 잃어버린 괄호
         * 입력값 mathEq = "100-40+50+74-30+29-45+43+11"
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mathEq = br.readLine();

        String[] splitByMinus = mathEq.split("-");

        int sum = 0;

        for (int i = 0; i < splitByMinus.length; i++) {
            String[] splitByPlus = splitByMinus[i].split("\\+");

            int num = 0;

            for (String byPlus : splitByPlus) {
                num += Integer.parseInt(byPlus);
            }
            
            if(i == 0) sum = num;
            else sum -= num;
        }

        System.out.println(sum);
    }
}
