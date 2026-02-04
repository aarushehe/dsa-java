import java.util.Scanner;

public class rowColumnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {{10,20,30,40},{13,25,35,45},{28,27,37,49},{33,34,38,50}};
        int target = scanner.nextInt();
        int[] result = search(matrix, target);
        System.out.println("Position: [" + result[0] + ", " + result[1] + "]");
        scanner.close();
    }

    static int[] search(int[][] matrix, int target){
        // Handle empty matrix
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[]{-1, -1};
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Start from top-right corner
        int r = 0;
        int c = cols - 1;  // Use cols-1, not matrix.length-1
        
        while(r < rows && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;  // Move down (search in next row)
            } else {
                c--;  // Move left (search in same row)
            }
        }
        return new int[]{-1, -1};
    }
}