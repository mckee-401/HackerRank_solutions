// https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            System.out.print(s1);
            for (int j = 0; j < (15 - s1.length()); j++) {
                System.out.print(" ");
            }
            // 15文字が最大で、足りない分は空白で埋める
            int x = sc.nextInt();
            // Complete this line
            if (x == 0) {
                System.out.println("000");
            } else if (x < 100) {
                System.out.println("0" + x);
            } else {
                System.out.println(+x);
            }
            // 数字を強制的に3桁にするので、1桁と2桁の時は0をつける

            // 模範解答
            // System.out.printf( "%-15s%03d %n", s1, x);

            // フォーマット指定子を用いる
            // 最後にfがつく関数を使用する場合は、表示形式を指定して出力することができる
            // 書き方はSystem.out.printf("書式指定子(出力したい文字もここ)", 引数);

            // %-15sは、%が書式指定子の開始、-が左寄せ、15が文字数の幅、sが文字列を出力を表す
            // %03dは、%が書式指定子の開始、0が0埋め、3が桁数、dが10進数表記を表す
            // %nは、改行を表す(フォーマット用の改行、OSに依存しないらしい)
        }
        System.out.println("================================");
        sc.close();
    }
}
