package com.fizzbuzz;

public class FizzBuzz {

    private static boolean isdivisible(int num, int div) {
        return ((num % div) == 0);
    }

    private static boolean containNum(int num, int div) {
        String numStr = Integer.toString(num);
        String divS = Integer.toString(div);
        return numStr.contains(divS);
    }

    public static String fizzBuzz(int num) {
        if (isdivisible(num, 3) && isdivisible(num, 5))
            return "FizzBuzz";
        if (isdivisible(num, 3))
            return "Fizz";
        if (isdivisible(num, 5))
            return "Buzz";
        return Integer.toString(num);
    }

    public static String fizzBuzzIncludeNumber(int num) {
        if ((isdivisible(num, 3) || containNum(num, 3)) && (isdivisible(num, 5) || containNum(num, 5)))
            return "FizzBuzz";
        if (isdivisible(num, 3) || containNum(num, 3))
            return "Fizz";
        if (isdivisible(num, 5) || containNum(num, 5))
            return "Buzz";
        return Integer.toString(num);
    }

}
