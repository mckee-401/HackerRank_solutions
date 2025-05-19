// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int idx = b.indexOf(ch);
            if (idx == -1) {
                return false;
            }

            b = b.substring(0, idx) + b.substring(idx + 1);
        }

        return b.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

// 以下模範解答--------------------------------------------------------------------

private static int[] frequency = new int[26];

// 26個のアルファベットの出現回数をカウントする配列
// 0-25: a-z
static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();

    for (char c : a.toCharArray()) {
        frequency[(int) c - 97]++;
        // String型をint型でキャストすることで文字コードを取得できる
        // 97は'a'の文字コードなので、a[0]が++される
        // これにより、各文字の出現回数をカウントする

        // toCharArray()は、String型をchar型の配列に変換するメソッド(Stringクラス)
    }
    for (char c : b.toCharArray()) {
        frequency[(int) c - 97]--;
        // 文字コードを取得して--する
        // これにより、aとbがアナグラムなら配列の要素の値は全て0になる
    }

    boolean anagrams = true;
    for (int i : frequency) {
        if (i != 0) {
            // 配列内の要素が全て0でなければアナグラムではない
        }
        anagrams = false;
        break;

    }
    return anagrams;
}