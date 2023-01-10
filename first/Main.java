import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        int i;
        out.println("==========TASKS FROM FIRST SECTION (1/2)==========");
        out.println("=====Task 1:=====");
        out.println(remainder(1, 3));
        out.println(remainder(3, 4));
        out.println(remainder(-9, 45));
        out.println(remainder(5, 5));
        out.println("=====Task 2:=====");
        out.println(triArea(3, 2));
        out.println(triArea(7, 4));
        out.println(triArea(10, 10));
        out.println("=====Task 3:=====");
        out.println(animals(2, 3, 5));
        out.println(animals(1, 2, 3));
        out.println(animals(5, 2, 8));
        out.println("=====Task 4:=====");
        out.println(profitableGamble(0.2, 50, 9));
        out.println(profitableGamble(0.9, 1, 2));
        out.println(profitableGamble(0.9, 3, 2));
        out.println("=====Task 5:=====");
        out.println(operation(24, 15, 9));
        out.println(operation(24, 26, 2));
        out.println(operation(15, 11, 11));
        out.println("=====Task 6:=====");
        out.println(ctoa('A'));
        out.println(ctoa('m'));
        out.println(ctoa('['));
        out.println(ctoa('\\'));
        out.println("=====Task 7:=====");
        out.println(addUpTo(3));
        out.println(addUpTo(10));
        out.println(addUpTo(7));
        out.println("=====Task 8:=====");
        out.println(nextEdge(8, 10));
        out.println(nextEdge(5, 7));
        out.println(nextEdge(9, 2));
        out.println("=====Task 9:=====");
        int a1[] = {1, 5, 9};
        out.println(sumOfCubes(a1));
        int a2[] = {3, 4, 5};
        out.println(sumOfCubes(a2));
        int a3[] = {2};
        out.println(sumOfCubes(a3));
        int a4[] = {};
        out.println(sumOfCubes(a4));
        out.println("=====Task 10:=====");
        out.println(abcmath(42, 5, 10));
        out.println(abcmath(5, 2, 1));
        out.println(abcmath(1, 2, 3));
        out.flush();
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static int triArea(int a, int b) {
        return a * b / 2;
    }

    public static int animals(int a, int b, int c) {
        return a * 2 + (b + c) * 4;
    }

    public static boolean profitableGamble(double prob, int prize, int pay) {
        return (prob * prize > pay) ? true : false;
    }

    public static String operation(int N, int a, int b) {
        if (a + b == N) return "added";
        if (a - b == N) return "subtracted";
        if (a * b == N) return "multiplied";
        if (a / b == N) return "devided";
        return "none";
    }

    public static int ctoa(char a) {
        return (int) a;
    }

    public static int addUpTo(int a) {
        return a * (a + 1) / 2;
    }

    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    public static int sumOfCubes(int[] a) {
        int cub = 0;
        for (int i = 0; i < a.length; i++) {
            cub += a[i] * a[i] * a[i];
        }
        return cub;
    }

    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a+=a;
        }
        return (a % c == 0) ? true : false;
    }

    public static String repeat(String a, int b) {
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b; j++) c = c + a.charAt(i);
        }
        return c;
    }

    public static int differenceMaxMin(int[] a) {
        int mn = a[0];
        int mx = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mx) mx = a[i];
            if (a[i] < mn) mn = a[i];
        }
        return mx - mn;
    }

    public static boolean isAvgWhole(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) s += a[i];
        return (s % a.length == 0) ? true : false;
    }

    public static int[] comulativeSum(int[] a) {
        int b[] = new int[a.length];
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) b[i] = b[i-1] + a[i];
        return b;
    }

    public static int getDeecimalPlaces(String a) {
        int s = 0;
        int flag = 0;
        for (int i = 0; i < a.length(); i++) {
            if (flag == 1) s++;
            if (a.charAt(i) == '.') flag = 1;
        }
        return s;
    }

    public static int Fibonacci(int a) {
        int s0 = 1;
        int s1 = 1;
        int s = 0;
        if (a == 0) return s0;
        if (a == 1) return s1;
        for (int i = 2; i <= a; i++) {
            s = s0 + s1;
            s0 = s1;
            s1 = s;
        }
        return s;
    }

    public static boolean isValid(String a) {
        if (a.length() > 5) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < '0' || a.charAt(i) > '9') return false;
        }
        return true;
    }

    public static boolean isStrangePair(String a, String b) {
        int al = a.length();
        int bl = b.length();
        if (al == 0 && bl == 0) return true;
        else if (al == 0) return false;
        else if (bl == 0) return false;
        if (a.charAt(0) == b.charAt(bl - 1) && b.charAt(0) == a.charAt(al - 1)) return true;
        return false;
    }

    public static boolean isPrefix(String a, String b) {
        b = b.substring(0, b.length() - 1);
        return a.startsWith(b);
    }

    public static boolean isSuffix(String a, String b) {
        b = b.substring(1, b.length());
        return a.endsWith(b);
    }

    public static String hexLattice(int a) {
        int s = 1, b = 6, i = 1;
        while (s < a) {
            s += b;
            b += 6;
            i++;
        }
        if (s != a) return "Invalid";
        String r = "";
        int j, k;
        for (j = 0; j < i; j++) {
            for (k = 1; k <= i - j; k++) r = r + ' ';
            for (k = 1; k <= i + j; k++) {
                r = r + 'o';
                r = r + ' ';
            }
            r = r + '\n';
        }
        for (j = i - 2; j >= 0; j--) {
            for (k = 1; k <= i - j; k++) r = r + ' ';
            for (k = 1; k <= i + j; k++) {
                r = r + 'o';
                r = r + ' ';
            }
            r = r + '\n';
        }
        return r;
    }

}