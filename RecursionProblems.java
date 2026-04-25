// Matt Ceran
// CSCI - Data Structures
// 4/24/2026
// recursion problems from the pdf plus the lecture ones (factorial, fibonacci, bunny ears).
// no loops, all recursion.

public class RecursionProblems {

    // factorial: n! = n * (n-1)!
    public static int factorial(int n) {
        if (n < 0) {
            // shouldn't happen but just in case
            throw new IllegalArgumentException("n cant be negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13...
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cant be negative");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // every bunny has 2 ears so total ears = 2 + the rest of the bunnies' ears
    public static int bunnyEars(int bunnies) {
        if (bunnies <= 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    // count how many 8's are in the number, but if an 8 has another 8
    // right before it (to the left) that one counts twice.
    // ex: 8818 -> rightmost 8 is normal (+1), then 1 (+0),
    // then 8 with an 8 left of it counts double (+2), then the last 8 (+1) = 4
    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;        // rightmost digit
        int rest = n / 10;             // chop off the rightmost digit
        int nextDigit = rest % 10;     // what the next digit on the left is

        if (lastDigit == 8) {
            // if the digit to the left of this 8 is also an 8, count this one twice
            if (nextDigit == 8) {
                return 2 + count8(rest);
            } else {
                return 1 + count8(rest);
            }
        }

        // not an 8, just keep going
        return count8(rest);
    }

    // count how many times "hi" shows up in the string
    public static int countHi(String str) {
        // if the string is too short to have "hi" we are done
        if (str.length() < 2) {
            return 0;
        }

        // check the first two characters
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            // found one, skip past it and keep checking
            return 1 + countHi(str.substring(2));
        }

        // didnt find one here, move forward by one
        return countHi(str.substring(1));
    }

    // same as countHi but if there's an 'x' right before the "hi" we don't count it
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        // if the string starts with "xhi" skip those 3 chars without counting
        if (str.length() >= 3 && str.charAt(0) == 'x'
                && str.charAt(1) == 'h' && str.charAt(2) == 'i') {
            return countHi2(str.substring(3));
        }

        // otherwise check normally for "hi"
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));
    }

    // count how many times sub appears in str without overlapping
    public static int strCount(String str, String sub) {
        // no room left for sub to fit
        if (str.length() < sub.length()) {
            return 0;
        }

        // grab a chunk the same size as sub from the front of str
        String front = str.substring(0, sub.length());

        if (front.equals(sub)) {
            // skip past the whole sub so we dont overlap
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        // didnt match, slide forward by one and try again
        return strCount(str.substring(1), sub);
    }

    // remove duplicate adjacent characters, like "yyzzza" -> "yza"
    public static String stringClean(String str) {
        // nothing to clean if its 1 char or less
        if (str.length() < 2) {
            return str;
        }

        // if first two are the same, drop one of them and keep going
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }

        // first char is fine, keep it and recurse on the rest
        return str.charAt(0) + stringClean(str.substring(1));
    }

    // little main to try out the methods
    public static void main(String[] args) {
        System.out.println("count8(8) = " + count8(8));
        System.out.println("count8(818) = " + count8(818));
        System.out.println("count8(8818) = " + count8(8818));

        System.out.println("countHi(\"xxhixx\") = " + countHi("xxhixx"));
        System.out.println("countHi(\"xhixhix\") = " + countHi("xhixhix"));

        System.out.println("countHi2(\"ahixhi\") = " + countHi2("ahixhi"));
        System.out.println("countHi2(\"xhixhi\") = " + countHi2("xhixhi"));

        System.out.println("strCount(\"catcowcat\", \"cat\") = "
                + strCount("catcowcat", "cat"));

        System.out.println("stringClean(\"yyzzza\") = " + stringClean("yyzzza"));
        System.out.println("stringClean(\"Hello\") = " + stringClean("Hello"));

        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("fibonacci(7) = " + fibonacci(7));
        System.out.println("bunnyEars(5) = " + bunnyEars(5));
    }
}
