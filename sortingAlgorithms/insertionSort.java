package sortingAlgorithms;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int[] ans = insertion(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }   
    
    static int[] insertion(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
        return nums;
    }
}
