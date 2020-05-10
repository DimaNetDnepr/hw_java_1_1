package com.skillsup;

public class Main {

    public static void main(String[] args) {
        factorial fact = new factorial();
        System.out.println(fact.factoring(44));
    }

    static class factorial {
        long result = 1;

        public long factoring(long x) {
            for (long i = 1; i <= x; i++) {
                result *= i;
            }
            return result;
        }

    }
}
