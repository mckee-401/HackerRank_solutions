// https://www.hackerrank.com/challenges/java-currency-formatter/problem

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        // NumberFormatクラスのgetCurrencyInstanceメソッドを使って、通貨フォーマットを取得
        String us_p = u.format(payment);
        // NumberFormatクラスのformatメソッドを使って、通貨フォーマットに変換

        Locale l = new Locale("en", "in");
        // インドはローケルがないので、新しくインスタンスを作成する
        NumberFormat i = NumberFormat.getCurrencyInstance(l);
        String india_p = i.format(payment);

        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china_p = c.format(payment);

        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france_p = f.format(payment);

        System.out.println("US: " + us_p);
        System.out.println("India: " + india_p);
        System.out.println("China: " + china_p);
        System.out.println("France: " + france_p);
    }
}
