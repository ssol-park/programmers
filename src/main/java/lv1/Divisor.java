package lv1;

public class Divisor {

    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;

        for (int i = left; i <= right; i++) {

            int sqrt = (int) Math.sqrt(i);

            for(int j = 1; j <= sqrt; j++){
                if(i % j == 0){
                    cnt++;

                    if(i / j != j){
                        cnt++;
                    }
                }
            }

            answer += cnt % 2 == 0 ? i : -i;

            cnt = 0;
        }

        return answer;
    }

}
