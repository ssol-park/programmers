package lv1;

public class WalkInThePark {
    public static void main(String[] args) {

        String[] park = new String[] {"OSO","OOO","OXO","OOO"};
        String[] routes = new String[] {"E 2","S 3","W 1"};

        int[] solution = solution(park, routes);
        System.out.println(solution[0] + "  " + solution[1]);
    }

    public static int[] solution(String[] park, String[] routes) {

        int width = park[0].length() - 1;
        int height = park.length - 1;

        int row = 0;
        int col = 0;

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");

            String direction = route[0];
            int step = Integer.parseInt(route[1]);
            System.out.println("direction = " + direction + " step = " + step);

            if(i < park.length) {

                String road = park[i];
                int start = road.indexOf("S");
                int obs = road.indexOf("X");
                System.out.println("road = " + road + " obs = " + obs);

                if(start > -1) step += start;
                System.out.println("step = " + step);

                if(obs == -1 || step < obs) {

                    System.out.println("@@@ direction = " + direction);

                    if("E".equals(direction) && !(row + step > width)) {
                        row += step;
                    }
                    if("W".equals(direction) && !(row - step < 0)) {
                        row -= step;
                    }

                    if("N".equals(direction) && !(col - step < 0)) {
                        col -= step;
                    }
                    if("S".equals(direction) && !(col + step > height - i)) {
                        col += step;
                    }
                }

                System.out.println("row = " + row + " col = " + col);
            }
        }

        return new int[] {col, row};
    }
}
