package lv1;

public class SmallSubstring {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";

//        String t = "500220839878";
//        String p = "7";

        int result = solution(t, p);

        System.out.println("result = " + result);
    }

    public static int solution(String t, String p) {
        int answer = 0;

        int tLength = t.length();
        int pLength = p.length();
        long numP = Long.parseLong(p);

        for (int i = 0; i < tLength; i++) {
            String subStr = t.substring(i);

            if(subStr.length() >= pLength) {
                if(numP >= Long.parseLong(subStr.substring(0, pLength))) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
