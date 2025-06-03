// https://www.hackerrank.com/challenges/java-hashset/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            String pair_reverse = pair_right[i] + " " + pair_left[i];
            //無理にペアにしなくても表示形式を合わせてあげれば型は一つで事足りる
            if(!set.contains(pair_reverse)){
                //(b,a)≠(a,b)なので、逆のペアが存在しない場合のみ追加する
            set.add(pair);
            }
            System.out.println(set.size());
        }
            
        
    }
}