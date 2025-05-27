// https://www.hackerrank.com/challenges/java-biginteger/problem

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
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        // BigInteger型なら 2^63-1まで格納可能

        sc.close();
        // 忘れがち

        BigInteger addresult = a.add(b);
        BigInteger multiplyresult = a.multiply(b);

        System.out.println(addresult);
        System.out.println(multiplyresult);

    }
}

// 以下模範解答--------------------------------------------------------------------

import java.math.*;
import java.util.Scanner;
public class Solution {
public static void main(String []args){
Scanner input = new Scanner(System.in);
String s1,s2;
s1=input.nextLine();
s2=input.nextLine();
input.close();
System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));

// BigIntegerクラスは、String型の10進数の数字から直接インスタンスを作成できる

}
}
