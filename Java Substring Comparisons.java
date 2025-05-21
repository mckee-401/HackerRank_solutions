// https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int n = s.length() - k + 1;
        String[] hl = new String[n];
        int j = k;

        for (int i = 0; i < n; i++) {
            hl[i] = s.substring(i, i + k);
            // substringでk文字間隔で切り出す
        }

        for (int l = 0; l < hl.length - 1; l++) {
            // for文内で使わないならiでもOK
            for (int m = 0; m < hl.length - 1; m++) {
                if (hl[m].compareTo(hl[m + 1]) > 0) {
                    // AcompareTo(B)で、
                    // 辞書順通り(A→B)なら-1
                    // 同じなら0
                    // 辞書順で逆(B→A)なら1

                    // 今回は、辞書順で並び替えるので>0という条件

                    String temp = hl[m];
                    hl[m] = hl[m + 1];
                    hl[m + 1] = temp;
                }
                // 辞書順に並べる(このまま使える)
            }
        }

        smallest = hl[0];
        largest = hl[hl.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

// 以下模範解答---------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class Solution {

// public static String getSmallestAndLargest(String s, int k) {
// String smallest = "";
// String largest = "";

// // 正しい数の部分文字列を格納する
// int n = s.length() - k + 1;
// String[] substrings = new String[n];

// // 部分文字列をすべて取り出す
// for (int i = 0; i < n; i++) {
// substrings[i] = s.substring(i, i + k);
// }

// // 辞書順でソート（バブルソート）
// for (int i = 0; i < n - 1; i++) {
// for (int j = 0; j < n - 1 - i; j++) {
// if (substrings[j].compareTo(substrings[j + 1]) > 0) {
// String temp = substrings[j];
// substrings[j] = substrings[j + 1];
// substrings[j + 1] = temp;
// }
// }
// }

// // 最小・最大を取得
// smallest = substrings[0];
// largest = substrings[n - 1];

// return smallest + "\n" + largest;
// }

// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// String s = scan.next();
// int k = scan.nextInt();
// scan.close();

// System.out.println(getSmallestAndLargest(s, k));
// }
// }
