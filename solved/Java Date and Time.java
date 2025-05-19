// https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. INTEGER month
     * 2. INTEGER day
     * 3. INTEGER year
     */
    // Scanner sc = new Scanner(System.in);
    // int month = sc.nextInt();
    // int day = sc.nextInt();
    // int year = sc.nextInt();

    // String dayofweek = findDay(month, day, year);

    // 数字を読み取るためのクラスは下に用意されているので今回は不要

    // 前提として、Dateクラス、getDay()メソッドは非推奨のメソッドであるため、使用しない

    public static String findDay(int month, int day, int year) {
        Date date = new Date(year - 1900, month - 1, day);
        // 引数をdateクラスに格納し、インスタンスを作成
        // 1900年からの経過年数を表すため、year - 1900とする
        // 0～11までの値を取るため、month - 1とする

        // 現在の形では、Date→LocalDate、getDay()→getDayOfWeek()に変換し、
        // LocalDate date = LocalDate.of(year,month,day);
        // DayOfWeek dayOfWeek = date.getDayOfWeel();
        // return dayOfWeek.toString(); とおく

        int dayof = date.getDay();
        // getDay()メソッドは曜日を日曜日から0~6の整数に当てはめて返すので整数型

        switch (dayof) {
            case 0:
                return "SUNDAY";
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            default:
                return "";
        }
        // switch文を用いて、整数を曜日に変換する
    }

}

// 以下コンパイル用----------------------------------------------------------------------------------------------------------------------------
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

// 模範解答

// import java.util.Arrays;
// import java.util.Calendar;
// import java.util.List;
// import java.util.Scanner;

// public class JavaDateAndTime {
// static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY",
// "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
// <>でリストにしたい型を指定し、Arrays.asList()メソッドで配列を受け取り、それを固定長のListに変換
// List = new ArrayList<>() は配列と異なり、サイズの変更が可能で、要素の追加がadd()でできる
// 基本はListを用いる

// public static String getDay(String day, String month, String year) {

// int y = Integer.parseInt(year);
// int m = Integer.parseInt(month);
// int d = Integer.parseInt(day);

// Calendar c = Calendar.getInstance();
// c.set(y, m-1, d);
// 月は0から始まるので-1する

// int p = c.get(Calendar.DAY_OF_WEEK);
// 曜日が1~7の整数で返される

// String s = days.get(p-1);
// return s;
// }

// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// String month = in.next();
// String day = in.next();
// String year = in.next();

// System.out.println(getDay(day, month, year));

// }
// }
