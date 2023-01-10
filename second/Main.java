import java.io.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        int i;
        out.println("==========TASKS FROM SECOND SECTION (2/2)==========");
        out.println("=====Task 1:=====");
        out.println(repeat("mice", 5));
        out.println(repeat("hello", 3));
        out.println(repeat("stop", 1));
        out.println("=====Task 2:=====");
        int b1[] = {10, 4, 1, 4, -10, -50, 32, 21};
        out.println(differenceMaxMin(b1));
        int b2[] = {44, 32, 86, 19};
        out.println(differenceMaxMin(b2));
        out.println("=====Task 3:=====");
        int c1[] = {1, 3};
        out.println(isAvgWhole(c1));
        int c2[] = {1, 2, 3, 4};
        out.println(isAvgWhole(c2));
        int c3[] = {1, 5, 6};
        out.println(isAvgWhole(c3));
        int c4[] = {1, 1, 1};
        out.println(isAvgWhole(c4));
        int c5[] = {9, 2, 2, 5};
        out.println(isAvgWhole(c5));
        out.println("=====Task 4:=====");
        int d1[] = {1, 2, 3};
        int e1[] = comulativeSum(d1);
        for (i = 0; i < e1.length; i++) out.print(e1[i] + " ");
        out.println();
        int d2[] = {1, -2, 3};
        int e2[] = comulativeSum(d2);
        for (i = 0; i < e2.length; i++) out.print(e2[i] + " ");
        out.println();
        int d3[] = {3, 3, -2, 408, 3, 3};
        int e3[] = comulativeSum(d3);
        for (i = 0; i < e3.length; i++) out.print(e3[i] + " ");
        out.println();
        out.println("=====Task 5:=====");
        out.println("21349087");
        out.println(getDeecimalPlaces("43.20"));
        out.println(getDeecimalPlaces("400"));
        out.println(getDeecimalPlaces("3.1"));
        out.println("=====Task 6:=====");
        out.println(Fibonacci(3));
        out.println(Fibonacci(7));
        out.println(Fibonacci(12));
        out.println("=====Task 7:=====");
        out.println(isValid("5901"));
        out.println(isValid("853a7"));
        out.println(isValid("732 32"));
        out.println(isValid("393939"));
        out.println("=====Task 8:=====");
        out.println(isStrangePair("ratio", "orator"));
        out.println(isStrangePair("sparkling", "groups"));
        out.println(isStrangePair("bush", "hubris"));
        out.println(isStrangePair("", ""));
        out.println("=====Task 9:=====");
        out.println(isPrefix("automation", "auto-"));
        out.println(isSuffix("arachnophobia", "-phobia"));
        out.println(isPrefix("retrospect", "sub-"));
        out.println(isSuffix("vocation", "-logy"));

        out.println("=====Task 10:=====");
        out.println(hexLattice(1));
        out.println(hexLattice(7));
        out.println(hexLattice(19));
        out.println(hexLattice(21));
        out.flush();
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