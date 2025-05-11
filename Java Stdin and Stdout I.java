//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Complete this line
        int b = scan.nextInt();
        int c = scan.nextInt();
        // 次のトークン(空・改行・タブで区切られた単位)がint型として解釈できるなら読み取り返す
        // next()メゾットは文字列を読み取るが、newxtInt()メゾットは整数として読み取る
        // 例えば、入力が"Hi 5"の場合、next()メゾットで1つ目、nextInt()メゾットで2つ目を読み取る
        scan.close();
        // scanner.close();は、Scannerクラスのインスタンスを閉じるメゾット

        System.out.println(a);
        // Complete this line
        System.out.println(b);
        System.out.println(c);

        // stdin...標準入力のこと、javaではSystem.inで標準入力を受け取ることができる
        // stdout...標準出力のこと、javaではSystem.outで標準出力を行うことができる
        // stderr...標準エラー出力のこと、javaではSystem.errで標準エラー出力を行うことができる
    }
}
