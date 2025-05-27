// https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger input  = new BigInteger(n);
        //BigIntegerクラスはString型から直接インスタンスを作成できるんでしたね
        boolean flg = input.isProbablePrime(1);
        // isProbablePrimeメソッドは、引数に指定した確率で素数かどうかを判定し、trueまたはfalseを返す
        //今回は素数判定をしたいので1
        //使うにはBigIntegerクラスのインスタンスが必要
        bufferedReader.close();
        
        if(flg){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
