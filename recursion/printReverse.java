public class printReverse{
    public static void main(String[] args){
        printR(5);
    }

    static void printR(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printR(n - 1);
    }
}