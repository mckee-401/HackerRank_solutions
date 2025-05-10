//https://www.hackerrank.com/challenges/java-stdin-stdout/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        // nextInt()やnext()の後にnextLine()を使う場合、
        // 上記のメゾットは改行コードを読み取らないので、nextLine()は空行を読み取ってしまう
        // そのため、nextLine()メゾットをscannerのインスタンスに対して実行し、改行を消す(バッファクリア)必要がある

        String s = scan.nextLine();
        // nextLine()は改行までの行全体(一行)を読み取る

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}