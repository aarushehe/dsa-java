public class ceilingOfANumber {
    
    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        if (target > arr[end]) {
            return -1;
        }
        
        System.out.println("Searching for ceiling of " + target);
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.printf("start=%d, end=%d, mid=%d, arr[mid]=%d%n", 
                            start, end, mid, arr[mid]);
            
            if (arr[mid] == target) {
                System.out.println("Found exact match!");
                return arr[mid];
            }
            
            if (target < arr[mid]) {
                end = mid - 1;
                System.out.println("Moving LEFT");
            } else {
                start = mid + 1;
                System.out.println("Moving RIGHT");
            }
        }
        
        System.out.printf("Loop ended: start=%d, arr[start]=%d%n", start, arr[start]);
        return arr[start];
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int result = findCeiling(arr, 15);
        System.out.println("Final result: " + result);
    }
}
