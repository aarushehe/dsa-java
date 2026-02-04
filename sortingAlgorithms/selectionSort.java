package sortingAlgorithms;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int[] ans = selection(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    static int[] selection(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int minIdx = i;
            for(int j = i; j < nums.length; j++){
                if(nums[minIdx] > nums[j]){
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
        return nums;
    }
}
