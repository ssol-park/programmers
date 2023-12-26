package lv1;

public class DesktopCleanup {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    if(minX > i) minX = i;
                    if(minY > j) minY = j;
                    if(maxX < i) maxX = i;
                    if(maxY < j) maxY = j;
                }
            }
        }
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
