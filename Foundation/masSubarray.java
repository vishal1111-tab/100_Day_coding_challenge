package Foundation;

import java.util.*;

public class masSubarray {
    public static void main (String[] args){
        int nums [] = {5,4,-1,7,8};
        int sum = 0;

        int maxi = nums[0];

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum > maxi){
            maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
       System.out.println(maxi);
    }
}