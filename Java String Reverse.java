// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B = new StringBuilder(A);
        String C = B.reverse().toString();
        // StringBuilder食らうsのreverse()メソッドを用いて逆順の文字列を作成
        // StringBuilder型をtoString()メソッドを用いてString型に変換
        if (C.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
