package Codeforces_1181;

import java.math.BigInteger;
import java.util.Scanner;

public class Codeforces_1181_B{


    public static void PleaseSolveItVarun() {
        Scanner sc = new Scanner(System.in);
//        int TC = sc.nextInt();
//        while (--TC >= 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            char[] s = new char[n + 1];
            for (int i = 0; i < n; ++i) {
                s[i] = s1.charAt(i);
            }
//            BigInteger x = new BigInteger(new String(s, 0, n));
            BigInteger best = null;

            for (int i = n / 2 + 1; i < n; ++i) {
                if (s[i] != '0') {
                    BigInteger cur = (new BigInteger(new String(s, 0, i))).add(new BigInteger(new String(s, i, n - i)));
                    if (best == null || cur.compareTo(best) < 0) {
                        best = cur;
                    }
                    break;
                }
            }
            for (int i = n / 2; i > 0; --i) {
                if (s[i] != '0') {
                    BigInteger cur = (new BigInteger(new String(s, 0, i))).add(new BigInteger(new String(s, i, n - i)));
                    if (best == null || cur.compareTo(best) < 0) {
                        best = cur;
                    }
                    break;
                }
            }
            System.out.println(best);
//        }
        sc.close();


    }
    public static void main(String[] args) {

        PleaseSolveItVarun();
    }
}