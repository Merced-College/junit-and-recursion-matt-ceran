// Matt Ceran
// CSCI - Data Structures
// 4/24/2026
// junit tests for the recursion problems. at least 10 per method:
// base cases, the pdf example cases, and a couple weird edge cases.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursionProblemsTest {

    @Test
    public void testFactorial0() {
        assertEquals(1, RecursionProblems.factorial(0));
    }

    @Test
    public void testFactorial1() {
        assertEquals(1, RecursionProblems.factorial(1));
    }

    @Test
    public void testFactorial2() {
        assertEquals(2, RecursionProblems.factorial(2));
    }

    @Test
    public void testFactorial3() {
        assertEquals(6, RecursionProblems.factorial(3));
    }

    @Test
    public void testFactorial4() {
        assertEquals(24, RecursionProblems.factorial(4));
    }

    @Test
    public void testFactorial5() {
        assertEquals(120, RecursionProblems.factorial(5));
    }

    @Test
    public void testFactorial6() {
        assertEquals(720, RecursionProblems.factorial(6));
    }

    @Test
    public void testFactorial7() {
        assertEquals(5040, RecursionProblems.factorial(7));
    }

    @Test
    public void testFactorial8() {
        assertEquals(40320, RecursionProblems.factorial(8));
    }

    @Test
    public void testFactorial10() {
        assertEquals(3628800, RecursionProblems.factorial(10));
    }

    @Test
    public void testFactorialNegativeThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> RecursionProblems.factorial(-1));
    }

    @Test
    public void testFactorialBigNegativeThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> RecursionProblems.factorial(-100));
    }

    @Test
    public void testFib0() {
        assertEquals(0, RecursionProblems.fibonacci(0));
    }

    @Test
    public void testFib1() {
        assertEquals(1, RecursionProblems.fibonacci(1));
    }

    @Test
    public void testFib2() {
        assertEquals(1, RecursionProblems.fibonacci(2));
    }

    @Test
    public void testFib3() {
        assertEquals(2, RecursionProblems.fibonacci(3));
    }

    @Test
    public void testFib4() {
        assertEquals(3, RecursionProblems.fibonacci(4));
    }

    @Test
    public void testFib5() {
        assertEquals(5, RecursionProblems.fibonacci(5));
    }

    @Test
    public void testFib6() {
        assertEquals(8, RecursionProblems.fibonacci(6));
    }

    @Test
    public void testFib7() {
        // 0,1,1,2,3,5,8,13 -> index 7 is 13
        assertEquals(13, RecursionProblems.fibonacci(7));
    }

    @Test
    public void testFib8() {
        assertEquals(21, RecursionProblems.fibonacci(8));
    }

    @Test
    public void testFib9() {
        assertEquals(34, RecursionProblems.fibonacci(9));
    }

    @Test
    public void testFib10() {
        assertEquals(55, RecursionProblems.fibonacci(10));
    }

    @Test
    public void testFib15() {
        assertEquals(610, RecursionProblems.fibonacci(15));
    }

    @Test
    public void testBunnyEars0() {
        assertEquals(0, RecursionProblems.bunnyEars(0));
    }

    @Test
    public void testBunnyEars1() {
        assertEquals(2, RecursionProblems.bunnyEars(1));
    }

    @Test
    public void testBunnyEars2() {
        assertEquals(4, RecursionProblems.bunnyEars(2));
    }

    @Test
    public void testBunnyEars3() {
        assertEquals(6, RecursionProblems.bunnyEars(3));
    }

    @Test
    public void testBunnyEars4() {
        assertEquals(8, RecursionProblems.bunnyEars(4));
    }

    @Test
    public void testBunnyEars5() {
        assertEquals(10, RecursionProblems.bunnyEars(5));
    }

    @Test
    public void testBunnyEars10() {
        assertEquals(20, RecursionProblems.bunnyEars(10));
    }

    @Test
    public void testBunnyEars12() {
        assertEquals(24, RecursionProblems.bunnyEars(12));
    }

    @Test
    public void testBunnyEars20() {
        assertEquals(40, RecursionProblems.bunnyEars(20));
    }

    @Test
    public void testBunnyEars100() {
        assertEquals(200, RecursionProblems.bunnyEars(100));
    }

    @Test
    public void testBunnyEarsNegative() {
        // negatives just give 0 since the base case is bunnies <= 0
        assertEquals(0, RecursionProblems.bunnyEars(-3));
    }

    @Test
    public void testCount8Single() {
        assertEquals(1, RecursionProblems.count8(8));
    }

    @Test
    public void testCount8WithOne8() {
        assertEquals(2, RecursionProblems.count8(818));
    }

    @Test
    public void testCount8DoubleCount() {
        // 8818 should give 4
        assertEquals(4, RecursionProblems.count8(8818));
    }

    @Test
    public void testCount8No8s() {
        assertEquals(0, RecursionProblems.count8(12345));
    }

    @Test
    public void testCount8Zero() {
        assertEquals(0, RecursionProblems.count8(0));
    }

    @Test
    public void testCount8Triple8() {
        // 888: rightmost 8 = +1, middle 8 has an 8 left of it = +2, last 8 = +2 = 5
        assertEquals(5, RecursionProblems.count8(888));
    }

    @Test
    public void testCount8Just88() {
        // 88: rightmost 8 = 1, then the other 8 has an 8 to its left = 2, so 3
        assertEquals(3, RecursionProblems.count8(88));
    }

    @Test
    public void testCount8AlternatingZeros() {
        // 80808: three 8s but none of them are next to each other so just 3
        assertEquals(3, RecursionProblems.count8(80808));
    }

    @Test
    public void testCount8EndingIn8() {
        assertEquals(1, RecursionProblems.count8(38));
    }

    @Test
    public void testCount8FiveEights() {
        // pattern: 2n-1 for n straight 8s, so 88888 = 9
        assertEquals(9, RecursionProblems.count8(88888));
    }

    @Test
    public void testCountHiBasic() {
        assertEquals(1, RecursionProblems.countHi("hi"));
    }

    @Test
    public void testCountHiOneSurrounded() {
        assertEquals(1, RecursionProblems.countHi("xxhixx"));
    }

    @Test
    public void testCountHiTwo() {
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
    }

    @Test
    public void testCountHiNone() {
        assertEquals(0, RecursionProblems.countHi("hello there"));
    }

    @Test
    public void testCountHiEmpty() {
        assertEquals(0, RecursionProblems.countHi(""));
    }

    @Test
    public void testCountHiBackToBack() {
        // 3 hi's stuck together
        assertEquals(3, RecursionProblems.countHi("hihihi"));
    }

    @Test
    public void testCountHiSingleH() {
        // just one char, cant be "hi"
        assertEquals(0, RecursionProblems.countHi("h"));
    }

    @Test
    public void testCountHiCaseSensitive() {
        // capital H doesnt count, only lowercase hi
        assertEquals(0, RecursionProblems.countHi("Hi"));
    }

    @Test
    public void testCountHiWithSpace() {
        assertEquals(2, RecursionProblems.countHi("hi hi"));
    }

    @Test
    public void testCountHiTrickyHhi() {
        // "hihhi" -> first hi at 0, then "hhi" left, only one hi in there
        assertEquals(2, RecursionProblems.countHi("hihhi"));
    }

    @Test
    public void testCountHi2Example1() {
        // ahixhi -> only the first hi counts because the second has x in front
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
    }

    @Test
    public void testCountHi2Example2() {
        // ahibhi -> both count since neither has x in front
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
    }

    @Test
    public void testCountHi2Example3() {
        // both hi's have x right before them so 0
        assertEquals(0, RecursionProblems.countHi2("xhixhi"));
    }

    @Test
    public void testCountHi2JustHi() {
        assertEquals(1, RecursionProblems.countHi2("hi"));
    }

    @Test
    public void testCountHi2Empty() {
        assertEquals(0, RecursionProblems.countHi2(""));
    }

    @Test
    public void testCountHi2NoHis() {
        assertEquals(0, RecursionProblems.countHi2("hello world"));
    }

    @Test
    public void testCountHi2BackToBack() {
        // hihi -> both count, nothing in front
        assertEquals(2, RecursionProblems.countHi2("hihi"));
    }

    @Test
    public void testCountHi2HxhiBlocked() {
        // hxhi -> the second hi is blocked by x, but the first 'h' alone doesnt match
        assertEquals(0, RecursionProblems.countHi2("hxhi"));
    }

    @Test
    public void testCountHi2DoubleHBeforeHi() {
        // hhi -> the h in front isnt an x so it still counts
        assertEquals(1, RecursionProblems.countHi2("hhi"));
    }

    @Test
    public void testCountHi2OneXhiSkippedRest() {
        // xhihihi -> first xhi gets skipped, then 2 hi's left
        assertEquals(2, RecursionProblems.countHi2("xhihihi"));
    }

    @Test
    public void testStrCountTwoCats() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStrCountOneCow() {
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow"));
    }

    @Test
    public void testStrCountNoDog() {
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCountNoOverlap() {
        // aaaa with sub aa -> 2 (no overlapping allowed)
        assertEquals(2, RecursionProblems.strCount("aaaa", "aa"));
    }

    @Test
    public void testStrCountEmptyString() {
        assertEquals(0, RecursionProblems.strCount("", "hi"));
    }

    @Test
    public void testStrCountSubBiggerThanStr() {
        assertEquals(0, RecursionProblems.strCount("hi", "hiya"));
    }

    @Test
    public void testStrCountThreeAbcs() {
        assertEquals(3, RecursionProblems.strCount("abcabcabc", "abc"));
    }

    @Test
    public void testStrCountSingleCharSub() {
        assertEquals(4, RecursionProblems.strCount("aaaa", "a"));
    }

    @Test
    public void testStrCountAdjacentMatches() {
        assertEquals(2, RecursionProblems.strCount("catcat", "cat"));
    }

    @Test
    public void testStrCountInMiddle() {
        // cd shows up once in the middle
        assertEquals(1, RecursionProblems.strCount("abcdef", "cd"));
    }

    @Test
    public void testStringCleanExample1() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
    }

    @Test
    public void testStringCleanExample2() {
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
    }

    @Test
    public void testStringCleanCaseSensitive() {
        // capital H stays, lowercase l's get squished
        assertEquals("Helo", RecursionProblems.stringClean("Hello"));
    }

    @Test
    public void testStringCleanAllSame() {
        assertEquals("a", RecursionProblems.stringClean("aaaaaa"));
    }

    @Test
    public void testStringCleanNothingToClean() {
        assertEquals("abcdef", RecursionProblems.stringClean("abcdef"));
    }

    @Test
    public void testStringCleanEmpty() {
        assertEquals("", RecursionProblems.stringClean(""));
    }

    @Test
    public void testStringCleanSingleChar() {
        assertEquals("z", RecursionProblems.stringClean("z"));
    }

    @Test
    public void testStringCleanTwoSame() {
        assertEquals("a", RecursionProblems.stringClean("aa"));
    }

    @Test
    public void testStringCleanTwoDifferent() {
        assertEquals("ab", RecursionProblems.stringClean("ab"));
    }

    @Test
    public void testStringCleanLongRun() {
        assertEquals("abcd", RecursionProblems.stringClean("aaabbbcccddd"));
    }
}
