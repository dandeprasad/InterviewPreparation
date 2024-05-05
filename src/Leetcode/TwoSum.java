package Leetcode;

public class TwoSum {
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int [] arr = new int [] {3,2,6};

        int[] da = twoSum.twoSum(arr, 6);
       System.out.print("" );
    }
        public int[] twoSum(int[] nums, int target) {
            int curr=0;int next=1;
            int numsSize = nums.length;
            do {
//3
//0,1 1,2
                if(nums[curr]+nums[next] == target){
                    System.out.println(curr +"_"+next);

                }
                ++next;++curr;
            }while(next!=numsSize);

            return null;
        }

}
