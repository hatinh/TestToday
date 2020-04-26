/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class MyToys {

    //chứa các hàm đồ chơi dùng ở mọi nơi nên ko cần new
    //tức là static
    //hàm tính n!=1.2.3.1...n, cF compute Factorial
    //0!=1 ;ko chơi giai thừa âm,giai thừ ko dc lớn quá
    //nhanh ddeeer long 15! vượt nữa tràn
    public static long cF(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n must between 0-15");
        }
        if (n == 0) {
            return 1;
        }
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
