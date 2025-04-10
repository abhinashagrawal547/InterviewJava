package MyPractice;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(countOfNonEqualNumber(nums,val));
    }

    private static int countOfNonEqualNumber(int[] nums, int val) {
        int[] finalNums = new int[nums.length];
        int count = 0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]==val){
                nums[i] = -1;
            }else {
                count++;
            }
        }

        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return count;
    }
}
