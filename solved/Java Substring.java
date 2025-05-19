// https://www.hackerrank.com/challenges/java-substring/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String result = S.substring(start, end);
        // 文字列Sのstart番目~end-1番目までを取得
        // 例: S=abcde, start=0, end=1の場合、S.substring(0,1)はaを取得
        System.out.println(result);
    }
}