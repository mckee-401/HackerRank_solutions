// http://hackerrank.com/challenges/java-2d-array/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
        int max=-54;
        //-9~9の数字で砂時計を作るので初期値が0では不可

        for(int i=0; i<4;i++){
            for(int j =0;j<4;j++){
                int sum =
                 arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)
                +arr.get(i+1).get(j+1)+
                arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                //砂時計は3.1.3の構成なので、どう頑張っても4*4しか動けない
                //後はiとjを指定して砂時計の合計値を出すだけ

                //ArrayListの二次元配列では、get(i).get(j)とすることで
                //i行目のj列目の値を取得できる
                if(sum>max){
                    max =sum;
                }
            }
        }
        System.out.println(max);
        bufferedReader.close();
    }
}
