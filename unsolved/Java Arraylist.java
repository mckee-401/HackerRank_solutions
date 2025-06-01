// https://www.hackerrank.com/challenges/java-arraylist/problem?

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<a;i++){
            array.add(sc.nextLine());
        }
        
        int b =Integer.parseInt(sc.nextLine());
        for(int i=0;i<b;i++){
            String[] query = sc.nextLine().split(" ");
            int r = Integer.parseInt(query[0]); //1
            int g = Integer.parseInt(query[1]); //3

            if(r>0 && r<=array.size()){
                String line = array.get(r-1);
                String[] numbers = line.trim().split(" ");  
            
                if(g>0 && g<=numbers.length-1){
                    //System.out.println("length is"+numbers.length);
                    System.out.println(numbers[g]);         
                }
                else{
                    System.out.println("ERROR!");
                }
                }else{
                 System.out.println("ERROR!");
                }
            }
             sc.close();
        }
}

// 以下模範解答-------------------------------------------------------------

public class Solution {

    public static void main(String[] args) 
    {

      Scanner scan = new Scanner(System.in);
      ArrayList[] list= new ArrayList[20002];
      // 要素がArrayListの配列を作成
      
      int n;
      n=scan.nextInt();
      //行数の取得
      for(int i=1;i<=n;i++)
      {
          list[i]=new ArrayList();
          //各行のリストを初期化
          int x=scan.nextInt();
          //要素数の取得

          for(int j=1;j<=x;j++)
          {
              int val=scan.nextInt();
              list[i].add(val);

          }
      }
      int q=scan.nextInt();

      for(int i=1;i<=q;i++)
      {
              int x,y;
              x=scan.nextInt();
              y=scan.nextInt();
              try
              {
                System.out.println(list[x].get(y-1));
              }catch(Exception e)
              {
                  System.out.println("ERROR!");
              }
              //エラーではじくならtry{}catch{}を使うのが良い
              //ArrayListのget()メソッドはインデックスが0から始まるのでy-1とする
      }
    }
}