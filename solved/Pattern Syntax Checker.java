// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            try {
                // Write your code
                String pattern = in.nextLine();
                Pattern p1 = Pattern.compile(pattern);
                // Patternクラスでは、compile()で正規表現のパターンを作成し、
                // matcher()で文字列とパターンを比較する
                // matcher.find()で部分一致、matcher.matches()で完全一致を確認できる

                // 一応 Pattern.compile(pattern)だけでいい、格納は不要
                System.out.println("Valid");
                // 今回はcompileできない場合に"Invalid"と出力する
            } catch (PatternSyntaxException e) {
                // PatternSyntaxExceptionは、正規表現の構文エラーを示す例外
                System.out.println("Invalid");
            } finally {
                testCases--;
                // 今回は必ず処理を行うfinallyブロックを使用した
                // 模範解答では、tryの外にtestCases--を書いている
            }
        }
    }
}
