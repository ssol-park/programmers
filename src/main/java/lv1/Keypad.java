package lv1;

public class Keypad {

    public String solution(int[] numbers, String hand) {

        StringBuilder sb = new StringBuilder();

        int leftNumber = 10, rightNumber = 12;

        for(int number : numbers) {

            if(number == 0) number = 11;

            switch (number % 3) {
                case 0:
                    sb.append("R");
                    rightNumber = number;
                    break;
                case 1:
                    sb.append("L");
                    leftNumber = number;
                    break;
                case 2:
                    int left = Math.abs(number - leftNumber);
                    int right = Math.abs(number - rightNumber);
                    int leftDistance = (left % 3) + (left / 3);
                    int rightDistance = (right % 3) + (right / 3);

                    if(leftDistance < rightDistance) {
                        sb.append("L");
                        leftNumber = number;
                    }else if(rightDistance < leftDistance) {
                        sb.append("R");
                        rightNumber = number;
                    }else {
                        if(hand.equals("left")) {
                            sb.append("L");
                            leftNumber = number;
                        }else {
                            sb.append("R");
                            rightNumber = number;
                        }
                    }
                    break;
            }
        }

        return sb.toString();
    }

}
