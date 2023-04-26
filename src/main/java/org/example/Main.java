package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int trueKey = Biscuit.randomDeathKey(100000, 999999);
        ConsoleColors.writeString("Biscuit-ключ доступа: " + trueKey, ConsoleColors.YELLOW);
        Scanner scan = new Scanner(System.in);
        ConsoleColors.writeString("Кол-во смертоносных потоков: ", ConsoleColors.CYAN);
        long threads = scan.nextLong();
        ConsoleColors.writeString("[Biscuit] Ключ доступа: ", ConsoleColors.PURPLE);
        Integer key = scan.nextInt();
        if (key == trueKey){
            ConsoleColors.writeString("АЛГОРИТМ НАГРУЗКИ ПРОЦЕССОРА ЗАПУЩЕН ["+threads+" ПОТОКОВ]", ConsoleColors.GREEN);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < threads ; i++){
                new PoisonThread("PoisonThread №" + i).start();
            }
        }

    }
}