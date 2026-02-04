package Math;

import java.util.*;

public class gcdAndLcm {
    public static void main(String[] args){
        int a = 15;
        int b = 27;
        int gcd = greatestCommmonDivisor(a, b);
        int lcm = leastCommonMultiple(a, b);

        System.out.println(gcd + " " + lcm);
    }

    static int greatestCommmonDivisor(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int leastCommonMultiple(int a, int b){
        return (a / greatestCommmonDivisor(a, b)) * b;      
    }
}
