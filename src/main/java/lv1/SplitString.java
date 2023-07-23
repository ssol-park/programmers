package lv1;

public class SplitString {

    public static void main(String[] args) {

        String s = "banana";
        int result = solution(s);

        System.out.println(" RESULT :: " + result);
    }

    public static int solution(String s) {

        char target = '1';
        int equalCnt = 0, differentCnt = 0, answer = 0;

        for (char c : s.toCharArray()) {
            if (target == '1') {
                target = c;
                equalCnt++;
                answer++;

            } else if (target == c) {
                equalCnt++;

            } else {
                differentCnt++;
            }

            if (equalCnt == differentCnt) {
                target = '1';
                equalCnt = 0;
                differentCnt = 0;
            }
        }

        return answer;
    }
}
