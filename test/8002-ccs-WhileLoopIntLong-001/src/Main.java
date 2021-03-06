
/**
  *
  * Simple while loop tested
  * 1 sinking expected for each test method
  *
  **/

public class Main {                                                                                                                                                   
    final int iterations = 1100;

    public int testLoopAddInt() {
        int testVar = 5000;
        int i = 0;
        while (i < iterations) {
            testVar += 5;
            i++;
        }

        return testVar;
    }

    public int testLoopSubInt() {
        int testVar = 5000;
        int i = 0;
        while (i < iterations) {
            testVar -= 5;
            i++;
        }

        return testVar;
    }

    public long testLoopSubLong() {
        long testVar = 5000;
        long i = 0;
        while (i < iterations) {
            testVar -= 5;
            i++;
        }

        return testVar;
    }

    public int testLoopMulInt(int n) {
        int testVar = 1;
        int additionalVar = 10;
        int i = 0;
        while (i < 10) {
            testVar *= 6;
            additionalVar += i%2 + i%3 + i%4 + i%5 + i%6 + i%7 + i%8 + i%9 + n;
            i++;
        }

        return testVar + additionalVar;
    }

    public long testLoopMulLong(long n) {
        long testVar = 1L;
        long i = 0;
        int additionalVar = 10;
        while (i < 12) {
            testVar *= 6L;
            additionalVar += i%2 + i%3 + i%4 + i%5 + i%6 + i%7 + i%8 + i%9 + n;
            i++;
        }

        return testVar + additionalVar;
    }

    public int testLoopDivInt() {
        int testVar = 5000;
        int i = 0;
        while (i < iterations) {
            testVar /= 5;
            i++;
        }

        return testVar;
    }

    public long testLoopDivLong() {
        long testVar = 5000;
        long i = 0;
        while (i < iterations) {
            testVar /= 5;
            i++;
        }

        return testVar;
    }

    public int testLoopRemInt() {
        int testVar = 5000;
        int i = 0;
        while (i < iterations) {
            testVar %= 5;
            i++;
        }

        return testVar;
    }

    public long testLoopRemLong() {
        long testVar = 5000;
        long i = 0;
        while (i < iterations) {
            testVar %= 5;
            i++;
        }

        return testVar;
    }

    public long testLoopAddLong() {
        long testVar = 5000;
        long i = 0;
        while (i < iterations) {
            testVar += 5;
            i++;
        }

        return testVar;
    }

    public static void main(String[] args)
    {
         System.out.println(new Main().testLoopAddInt());
System.out.println(new Main().testLoopAddLong());
System.out.println(new Main().testLoopRemLong());
System.out.println(new Main().testLoopRemInt());
System.out.println(new Main().testLoopDivLong());
System.out.println(new Main().testLoopDivInt());
System.out.println(new Main().testLoopMulLong(10));
System.out.println(new Main().testLoopMulInt(10));
System.out.println(new Main().testLoopSubLong());
System.out.println(new Main().testLoopSubInt());
    }

}  

