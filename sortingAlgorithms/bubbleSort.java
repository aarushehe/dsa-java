package sortingAlgorithms;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int[] ans = bubble(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
    static int[] bubble(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            boolean sorted = false;
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sorted = true;
                }
            }
            if(sorted == false){
                    break;
                }
        }
        return nums;
    }
}
