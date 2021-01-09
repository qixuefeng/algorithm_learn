package com.learn.chapter1;

public class Lesson1 {

    public static void main(String[] args) {
        // 求两个数的最大公约数

        int gcd = gcd(23 * 55, 23);
        int gcd1 = gcd1(23 * 55, 23);
//        System.out.println(gcd);
        System.out.println(gcd1);

    }

    /**
     * 这个是标准答案
     */
    public static int gcd1(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd1(q, r);
    }

    /**
     * 若q是0，则最大公约数为p。否则，将p除以q得到余数r, p和q的最大公约数即为q和r的最大公约数。
     * 这个是自己写的，又多又不简约
     */
    public static int gcd(int q, int p) {

        if (q == 0) {
            return p;
        }
        if (p == 0) {
            return q;
        }
        if (p == q) {
            return p;
        }

        int r = 0;
        int other = 0;

        if (q > p) {
            r = q % p;
            other = p;
        }

        if (p > q) {
            r = p % q;
            other = q;
        }

        return gcd(r, other);
    }

}
