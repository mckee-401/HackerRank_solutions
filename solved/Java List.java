// https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int query = sc.nextInt();
        for(int i=0;i<query;i++){
            list.add(sc.nextInt());
        }
        int count=sc.nextInt();
        for(int j=0;j<count;j++){
            String flg =sc.next();
            if(flg.equals("Insert")){
                list.add(sc.nextInt(),sc.nextInt());
            }
            if(flg.equals("Delete")){
                list.remove(sc.nextInt());
            }   
        }
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j)+" ");
        }
        sc.close();
        
    }
}

//next()やnextInt()は改行をバッファに残すため、nextLine()を使うと残った空文字を読み取る可能性がある
// そのため、next()やnextInt()を使った後は、必ずnextLine()を使って改行を読み取る必要がある
//又は、nextLine()を使わず構成する