// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //trim()で前後の空白を削除しておくと良い
        
        // Write your code here.
        
        String[] split1 = s.trim().split("[^A-Za-z]+");
        //trim()で前後の空白を削除
        //split()で正規表現にマッチする文字列で分割
        //今回残したいのはアルファベットなので、[^A-Za-z]+とすることで
        //アルファベット以外の文字列を全て削除して分割する

        //模範解答は、s.replaceAll("[^\\p{Alpha}]+", " ").trim();
        //\\p{Alpha}は、アルファベット全般
        //^が否定、+が1回以上の繰り返し
        //これらをreplaceAll()で空白に置き換え
        //trim()で前後の空白を削除

        if(split1.length == 1 && split1[0].isEmpty()){
            //入力がスペースのみの場合長さは1で、要素は空文字列
            //この場合は、トークンが存在しないので0を出力
            System.out.println("0");
        }
        else{
        System.out.println(split1.length);
        for(String r :split1){
        System.out.print(r);
        System.out.println("");
        }
        
    }
    
            scan.close();
    }
}

//模範解答-------------------------------------------------------------

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
            
            if(s.isEmpty()) {
                // String contains no valid tokens
                System.out.println(0);
            }
            else {
                // Split the string into valid tokens
                String[] strings = s.split("\\p{Space}+");
                // \\p{Space}+は1個以上の空白文字で区切る
                
                // Print number of tokens
                System.out.println(strings.length);
                
                // Print each token
                for(String str : strings){
                    System.out.println(str);
                }
            }
        }
    }
}
