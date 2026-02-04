package arrays;
import java.util.*;

public class arrayreverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }   
}
