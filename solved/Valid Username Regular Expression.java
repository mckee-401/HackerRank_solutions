// https://www.hackerrank.com/challenges/valid-username-checker/problem

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    // 総じて、何をさせたい問題なのかを考える(問題を翻訳しても良いので)

    // 正規表現
    // 今回の条件は
    // 1. 先頭はアルファベット
    // 2. 8文字以上30文字以下
    // 3. アルファベット(大小)、数字、アンダースコアのみ使用
    // 4. 先頭に来るのはアルファベットのみ

    // ^...先頭 []...いずれかに一致 a-z...小文字のアルファベット A-Z...大文字のアルファベット
    // 0-9...数字 {}...回数指定 {7,29}...7文字以上9文字以下
    // $...末尾
    // 先頭で1文字指定しているので+7~29文字
    // 末尾で$を使用することで、30文字までの制限をかけている(使わないと部分一致になる)

    // 誤:"^[[a-z]|[A-Z]][[a-z]|[A-Z]|_[0-9]]{7,29}"
    // |(パイプライン)は、[]の中では使用できない(文字として扱われてしまう)
    // 外で使用するとORの意味

}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}