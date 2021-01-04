package com.yiming.Test;

public class CTest {

    public static void main(String[] args) {
        System.out.println("wfw"+zhuhe(1,10));
    }

    public static int zhuhe(int r , int n ) {
        int 分子 = 1;
        for (int x = n; x >r; x--) {
            分子 = x * 分子;
        }
        System.out.println(分子);
        int 分母 = 1;
        for (int x = (n - r); x > 0; x--){

            分母 = 分母 * x;
        }
        System.out.println(分母);
        return 分子/分母;
    }
}
