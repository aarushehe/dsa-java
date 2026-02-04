package recursionArray;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print(search(arr, 4));
    }

    static int i = 0;
    static int search(int[] arr, int n){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == n){
            return i;
        }
        i++;

        return search(arr, n);
    }
}
