package lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Remainder {

    public int mySolution(int n) {
        List<Integer> list = new ArrayList<>();

        int num = n - 1;

        int sqrt = (int) Math.sqrt(num);

        for (int i = 1; i <= sqrt; i++) {

            if(num % i == 0) {
                if(i > 2) {
                    list.add(i);
                }

                if(num / i != i){
                    list.add(num / i);
                }

            }

        }

        list.sort(Comparator.naturalOrder());

        return list.get(1);
    }

    public int mySolution2(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if ((n - 1) % i == 0) {
                return i;
            }

        }

        return n - 1;
    }

    public int othersSolution(int n) {
        int answer = 0;
        boolean flag = false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if ((n - 1) % i == 0) {
                answer = i;
                flag = true;
                break;
            }

        if (!flag)
            answer = n - 1;


        return answer;
    }

}
