//https://www.hackerrank.com/challenges/java-if-else/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int flg = N % 2;
        // 結局2か所しか使わなかったので不要かも
        if (flg == 1) {
            System.out.println("Weird");
        }
        if (flg == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            } else {
            }
        }

        // 最短回答分岐例
        // if (N % 2 == 1) {
        // System.out.println("Weird");
        // } else if (N >= 2 && N <= 5) {
        // System.out.println("Not Weird");
        // } else if (N >= 6 && N <= 20) {
        // System.out.println("Weird");
        // } else {
        // System.out.println("Not Weird");
        // }
        scanner.close();
    }
}
