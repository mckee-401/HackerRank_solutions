// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            // hasNext()は次のトークン(要素)が存在するならばtrue、存在しなければfalseを返す
            count++;
            String element = sc.nextLine();
            // Java Stdin and Stdout IIで使った一行を読み取るnextLine()を使う
            //
            System.out.println(count + " " + element);
            // 模範解答: System.out.println(++line_num + " " + sc.nextLine());
        }
    }
}