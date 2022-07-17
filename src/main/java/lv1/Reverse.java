package lv1;

public class Reverse {

    public int solution(int n) {

        int answer = 0;

        StringBuilder sb = new StringBuilder();

        while (n > 0) {

            if(n % 3 < 10) {
                sb.append(n % 3);
            }

            n /= 3;

        }

        String reversed = sb.reverse().toString();

        for (int i = 0; i < reversed.length(); i++) {

            int squared = (int) Math.pow(3, i);

            answer += squared * (reversed.charAt(i) - '0');

        }

        return answer;
    }
}
