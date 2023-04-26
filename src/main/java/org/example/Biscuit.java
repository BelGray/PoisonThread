package org.example;

public class Biscuit {

    public static long randomVariable(long min, long max){
        return (long) ((Math.random() * (max - min)) + min);
    }

    public static int randomDeathKey(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
