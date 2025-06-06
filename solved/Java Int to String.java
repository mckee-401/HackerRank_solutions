// https://www.hackerrank.com/challenges/java-int-to-string/problem 

import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            // String s=???; Complete this line below
            String s = Integer.toString(n);
            // ここだけ解答
            // 整数をオブジェクトとして使用したい場合は、Integer型を用いる
            // 参考:
            // Integer n = in.nextInt();
            // String s = n.toString();

            // あとString.valueOf(int)でもOK

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
