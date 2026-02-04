package recursion;

public class productOfDigits {
    public static void main(String[] args){
        System.out.print(product(12345));
    }
    static int product(int n){
        if(n == 0){
            return 1;
        }
        int digit = n % 10;
        n = n / 10;
        return digit * product(n);
    }
}
