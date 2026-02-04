public class bitonicPoint {
    public int maxPoint(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] > arr[mid + 1]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
    
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        bitonicPoint solution = new bitonicPoint();
        int ans = solution.maxPoint(arr);
        System.out.println(ans);
    }
}
