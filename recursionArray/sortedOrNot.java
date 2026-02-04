package recursionArray;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 9, 12};
        System.out.print(isSorted(arr));
    }
    public static int i = 1;
    static boolean isSorted(int[] arr){
        if(i == arr.length){
            return true;
        }

        if(arr[i] < arr[i - 1]){
            return false;
        }
        i++;

        return isSorted(arr);
    }
}
