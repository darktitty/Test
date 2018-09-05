package cn.test_08;

import java.math.BigInteger;
import java.util.Arrays;

public class Math02 {
    public static void main(String[] args){
        BigInteger a = new BigInteger("100");
        BigInteger b =  new BigInteger("50");

        System.out.println(a.add(b));

        BigInteger[] c =a.divideAndRemainder(b);
        System.out.println(Arrays.toString(c));

        System.out.println(c[0]);
        System.out.println(c[1]);

    }
}
