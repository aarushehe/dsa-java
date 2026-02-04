import java.util.Scanner;

public class rangeOfANumber {

    private int minFinder(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                result = mid;
                right = mid - 1;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }

    private int maxFinder(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                result = mid;
                left = mid + 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }

    public int[] searchRange(int[] arr, int target){
        int result[] = new int[]{-1, -1};
        int min = minFinder(arr, target);
        if(min == -1){
            return result;
        }
        int max = maxFinder(arr, target);

        result[0] = min;
        result[1] = max;

        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 8, 10, 15};
        int target = 12;

        rangeOfANumber solution = new rangeOfANumber();
        int[] result = solution.searchRange(arr, target);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
        scanner.close();
    }
}
