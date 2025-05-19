// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Write your code here

    static int B, H;
    static boolean flag;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        } else {
            flag = true;
        }
        // static初期化ブロック
        // クラスが最初に読み込まれたときに自動で一回実行される
        // main メソッドに書くべき処理をクラス本体（static領域）にどうしても書かないといけない場合に使用する
        // ←staticなコンテキストからアクセスできるようにする
        // ←mainメソッド実行前に処理を実行できる

        // try {
        // if (B <= 0 || H <= 0)
        // throw new Exception("Breadth and height must be positive");
        // } catch (Exception e) {
        // System.out.println(e);
        // System.exit(0);
        // }

        // 模範解答
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
