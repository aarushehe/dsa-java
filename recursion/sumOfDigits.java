package recursion;

public class sumOfDigits {
    public static void main(String[] args){
        System.out.print(sum(123456));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        int digit = n % 10;
        n = n / 10;
        return digit + sum(n);
    }
}
