package lv1;

import java.util.HashSet;

public class Pokemon {

    public int solution(int[] nums) {

        int mine = nums.length / 2;

        HashSet<Integer> mons = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            mons.add(nums[i]);
        }

        if(mons.size() > mine) {
            return mine;
        }

        return mons.size();
    }

}
