package com.company;

public class Main {

    public static  void main(String[] args){


        int[] nums = {33};
        int target = 6;


        int[] sumArray = new int[2];
        boolean foundSum = false;

        for(int x = 0; x <= nums.length - 1 ; x++){
            if(foundSum){
                break;
            }
            for(int i = 0; i <= nums.length - 1 ; i++){
                if(nums[x] + nums[i] == target && x != i){
                    sumArray[0] = x;
                    sumArray[1] = i;
                    foundSum = true;
                }
            }
        }

        for (int n :sumArray){
            System.out.println(n);
        }

    }
}
