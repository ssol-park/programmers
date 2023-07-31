package lv1;

import java.util.ArrayList;
import java.util.List;

public class FoodFight {

    public static void main(String[] args) {

        int[] food = new int[] {1, 3, 4, 6};

        String result = solution(food);

        System.out.println("RESULT :: " + result);

    }

    public static String solution(int[] food) {
        List<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < food.length; i++) {
            int cnt = food[i] % 2 == 0 ? food[i] / 2 : (food[i] - 1) / 2;

            for (int j = 0; j < cnt; j++) {
                list.add(i);
            }
        }

        int foodCnt = list.size();
        int totalFoodCnt = (foodCnt * 2) + 1;

        for (int i = 0; i < totalFoodCnt; i++) {

            if(i < foodCnt) {
                sb.append(list.get(i));
            }else if(i == foodCnt) {
                sb.append(0);
            }else if(i > foodCnt) {
                sb.append(list.get((totalFoodCnt - (i + 1))));
            }

        }

        return sb.toString();
    }
}
