package Math;

public class primenumber {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 20;//write a number;
        for(int i = 1; i <= n; i++){
            System.out.print(i + " = ");
            System.out.println(isPrime(i));
        }
    }
}
