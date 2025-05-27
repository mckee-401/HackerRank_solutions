// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // Write your code here.
        
        String[] split1 = s.trim().split("[^A-Za-z]+");
        if(split1.length == 1 && split1[0].isEmpty()){
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

