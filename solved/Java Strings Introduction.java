
// https://www.hackerrank.com/challenges/java-strings-introduction/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // AcompareTO(B)は、AがBより辞書順で後であれば整数を返すので、Yes
        // AがBより辞書順で前であれば負の整数を返すので、No
        // イメージ的には 前のときA=2,B=3でA-B=-1、後のときA=3,B=2でA-B=1
        String a_o = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b_o = B.substring(0, 1).toUpperCase() + B.substring(1);
        // substringで第一引数から(第二引数-1)までの文字列を取得
        // toUpperCase()で大文字に変換
        // substring(1)で1文字目以降を取得
        System.out.println(a_o + " " + b_o);

    }
}
