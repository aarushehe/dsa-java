package Math;

public class findPrime {
    public static int totalPrime(int n){
        int count = 0;
        boolean isPrime = true;

        for(int i = 0; i <= n; i++){
            int c = 2;
            while(c * c <= n){
                if(n % c == 0){
                    isPrime = false;
                }
                c++;
            }
            if(isPrime == false){
                count++;
            }
        }
    }
    public static void main(String[] args){

    }
}
