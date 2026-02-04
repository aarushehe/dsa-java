package Math;

public class squareRoot {
    public static void main(String[] args){
        int n = 40;  //find its square root
        int p = 3;   //p stands for precision
        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p){
        //implementing binary search
        int start = 0;
        int end = n;

        double root = 0.0;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if((long) mid * mid == n){
                return mid;
            }
            if((long) mid * mid < n){
                root = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        double incr = 0.1;
        for(int i = 0; i < p; i++){
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
