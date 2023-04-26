package org.example;

public class PoisonThread extends Thread {
    String poisonThreadName;

    public PoisonThread(String poisonThreadName) {
        this.poisonThreadName = poisonThreadName;
    }

    @Override
    public void run() {
        while (true) {
            long deathNum = Biscuit.randomVariable(1L, 9223372036854775807L);
            long deathDenominator = Biscuit.randomVariable(1L, 9223372036854775807L);
            long deathPoisonActionDenominator = Biscuit.randomVariable(1L, 9223372036854775807L);
            for (long x = deathNum; true; x /= deathDenominator) {
                long poisonAction = (x / deathPoisonActionDenominator);
                System.out.println("Poison thread is loading the processor. Thread: " + poisonThreadName);
            }

        }
    }
}
