// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        //これでリストを作る時は、n個の配列が生成される
        //n-1個ではないので注意！！！

        for(int i =0;i<a.length;i++){
            int val = scan.nextInt();
            a[i] = val;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}