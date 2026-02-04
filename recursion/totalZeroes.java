package recursion;

public class totalZeroes {
    public static void main(String[] args) {
        countZero(0);
        System.out.print(count);
    }

    static int count = 0;

    static void countZero(int n){
        if(n == 0){
            return;
        }
        int digit = n % 10;
        if(digit == 0){
            count++;
        }
        countZero(n / 10);
    }
}
