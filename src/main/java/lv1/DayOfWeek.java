package lv1;

import java.time.LocalDate;

public class DayOfWeek {

    public String solution(int a, int b) {

        int[] lastDays = {31,29,31,30,31,30,31,31,30,31,30,31};

        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        int date = 0;

        for (int i = 0; i < a - 1; i++) {
            date += lastDays[i];
        }

        date += b - 1;

        return week[date % 7];
    }

    public String solution2(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }

}
