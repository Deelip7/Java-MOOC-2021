package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] sortArr = new int[3];
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(sortArr);


        for (int i = 0; i < nums.length; i++) {
            for (int x = 1; x < nums.length; x++) {
                for (int y = 2; y < nums.length; y++) {
                    if ((nums[x] + nums[y]) + nums[i] == 0 && x != y && x != i && y != i) {
                        sortArr[0] = nums[x];
                        sortArr[1] = nums[y];
                        sortArr[2] = nums[i];
                        Arrays.sort(sortArr);
                        res.add(Arrays.asList(sortArr[0], sortArr[1], sortArr[2]));
                    }
                }
            }
        }

        System.out.println(res);

    }
}


