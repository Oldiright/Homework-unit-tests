package org.example;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        if(n == 0) {
            throw new IllegalArgumentException();
        }
        int result = 0;
        while (n != 0) {
            result += n;
            n-= 1;
        }
        return result;
    }
}