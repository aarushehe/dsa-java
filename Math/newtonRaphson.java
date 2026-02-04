package Math;

public class newtonRaphson {
    public static void main(String[] args){
        double n = 40;
        System.out.println(sqrt(n));
    }
    static double sqrt(double n){
        /*int start = 0;
        int end = n;
        double root = 0;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(mid * mid == n){
                root = mid;
            }else if(mid * mid < n){
                root = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return (root + (n / root)) / 2;*/
        double x = n;
        double root;

        while(true){
            root = 0.5 * (x + (n / x));
            
            if(Math.abs(root - x) < 1){
                break;
            }

            x = root;
        }
        return root; 
    }
}
