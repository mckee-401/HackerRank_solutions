// https://www.hackerrank.com/challenges/phone-book/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        //<キーとなるデータ型, 値となるデータ型>
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            //nextInt()とnextLine()を併用しているので、空白を消している
            map.put(name,phone);
		}
		while(in.hasNext())
        //hasNext()は、次の入力があるかどうかを判定する
		{
			String s=in.nextLine();
            
            if(map.containsKey(s)){
                //containsKey()は、キーが存在するかどうかを判定する
                //containsValue()は、値が存在するかどうかを判定する

                //contains()は存在しない
            System.out.println(s+"="+map.get(s));   
            }
            else{
                System.out.println("Not found");
            }
            
		}
        in.close();
	}
}




