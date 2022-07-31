package lv1;

public class MiddleLetters {

    public String solution(String s) {

        int idx = 0;

        if(s.length() % 2 != 0) {

            idx = (int) Math.round(s.length() / (2 * 1.0));

            return s.substring(idx - 1, idx);

        }else {

            idx = s.length() / 2;

            return s.substring(idx - 1 ,idx + 1);
        }

    }

}
