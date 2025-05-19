//https://www.hackerrank.com/challenges/java-loops-i/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // trim()で読み込んだ文字列の前後の空白を取り除く
        int result;
        // 変数を用意しなくても別にいいのでは？
        bufferedReader.close();
        for (int i = 1; i <= 10; i++) {
            result = i * N;
            System.out.println(N + " x " + i + " = " + result);
        }

    }
}
