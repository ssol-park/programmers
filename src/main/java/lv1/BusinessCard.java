package lv1;

public class BusinessCard {

    public int solution(int[][] sizes) {

        int w = 0, h = 0;

        for (int i = 0; i < sizes.length; i++) {

            if(sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }

            if(sizes[i][0] > w) {
                w = sizes[i][0];
            }

            if(sizes[i][1] > h) {
                h = sizes[i][1];
            }
        }

        int answer = w * h;

        return answer;
    }

    public int solution2(int[][] sizes) {

        int w = 0, h = 0;

        for (int[] bizCard : sizes) {

            w = Math.max(w, Math.max(bizCard[0], bizCard[1]));
            h = Math.max(h, Math.min(bizCard[0], bizCard[1]));

        }

        int answer = w * h;

        return answer;
    }
}
