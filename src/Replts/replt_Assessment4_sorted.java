package Replts;

public class replt_Assessment4_sorted {

    public static boolean isSort(int[] nums){
        boolean sorted = false;

        if(nums[0] < nums[1] && nums[1] < nums[2]){
            sorted = true;
        }else{
            sorted = false;
        }
        return sorted;
    }
}
// fuck this assessment too