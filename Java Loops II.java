// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;

class Solution {

    class Solution {
        public static void main(String[] argh) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            // テストケースの回数を取得
            for (int i = 0; i < t; i++) {
                // テストケースの個数分だけループ
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                // a,b,nはローカル変数なのでここでループ

                // 以下テストケース1回分の計算を行う
                int result = a;
                for (int j = 0; j < n; j++) {
                    result += (int) Math.pow(2, j) * b;
                    // Math.pow(2,j)は2のj乗を計算するメソッド
                    // Math.pow()はdouble型で返すのでint型にキャストする
                    System.out.print(result + " ");
                }

                // for(int j=0;j<n;j++){
                // a+=b;
                // if(j>0)
                // System.out.print(" ");
                // System.out.print(a);

                // b=b*2;
                // }

                // 上記のように毎回bを2倍にしていく方法もある

                System.out.println("");
            }
            in.close();
        }
    }
}