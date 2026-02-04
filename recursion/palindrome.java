package recursion;

public class palindrome {
    public static void main(String[] args){
        System.out.print(isPalindrome(12341));
    }

    static boolean isPalindrome(int n){
        int digits = countDigits(n);
        return check(n, digits);
    }

    static boolean check(int n, int digits){
        if(n < 10){
            return true;
        }

        int first = n / pow10(digits - 1);
        int last = n % 10;

        if(first != last){
            return false;
        }

        int middle = (n % pow10(digits - 1)) / 10;

        return check(middle, digits - 2);
    }

    static int countDigits(int n){
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
          }
        return count;
    }

    static int pow10(int exp){
        int res = 1;
        while(exp-- > 0){
            res = res * 10;
        }
        return res;
    }
}
