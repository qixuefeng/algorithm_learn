package com.learn.chapter1;

public class Lesson1 {

    public static void main(String[] args) {

        // 求两个数的最大公约数
//        int gcd = gcd(23 * 55, 23);
//        int gcd1 = gcd1(23 * 55, 23);
//        System.out.println(gcd);
//        System.out.println(gcd1);

        // 二分查找
//        int[] data = {1, 2, 3, 4, 5, 7, 8, 11, 12, 23, 45, 55, 56, 67, 88, 89, 90, 123, 124, 125};
//        int i = searchBinary(126, data);
//        if (i == -1) {
//            System.out.println(-1);
//        } else {
//            System.out.println(data[i]);
//        }

        // 1.1.1 给出以下表达式的值
        int i = (0 + 15) / 2;// 盲猜7
        System.out.println(i);
        double v = 2.0e-6 * 100000000.1;// 盲猜200.2，猜错了
        System.out.println(v);
        boolean b = true && false || true && true;// 盲猜true
        System.out.println(b);

//        //1.1.2 给出以下表达式的类型和值
////        (1 + 2.236) / 2; 盲猜double,值为1.618
//        double v1 = (1 + 2.236) / 2;
//        System.out.println(v1);
////        1 + 2 + 3 + 4.0 盲猜double，值为10,值其实为10.0
//        double v2 = 1 + 2 + 3 + 4.0;
//        System.out.println(v2);
////        4.1>=4 盲猜boolean，true
//        boolean b1 = 4.1 >= 4;
//        System.out.println(b1);
////        1 + 2 + "3"  盲猜string，33
//        String s = 1 + 2 + "3";
//        System.out.println(s);

//        1.1.3 编写一个程序，获取三个整数，如果都相等，打印equal，不相等打印not equal
//        equal3(1, 1, 1);

        

    }

    public static void equal3(int a, int b, int c) {
        System.out.println(a == b && a == c ? "equal" : "not equal");
    }

    // region [最大公约数]

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

    // endregion

    // region [二分查找]

    /**
     * 二分查找算法，在排序后的数组中，找到想要的数字的位置，如果没有，就返回-1
     * 思路：
     * 拟定两个位置，A和B，在A和B之间找，先找A和B中间的值M
     * 如果M大于key，则key在A和M之间，B替换成M继续找
     * 如果M小于key，则key在M和B之间，A替换成M继续找
     *
     * @param key  待查找的数字
     * @param data 排序好的数字
     */
    public static int searchBinary(int key, int[] data) {

        int startIndex = 0;
        int endIndex = data.length - 1;
        while (endIndex >= startIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            int mid = data[midIndex];
            if (mid > key) {
                endIndex = midIndex - 1;
            } else if (mid < key) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -1;

    }

    // endregion

}
