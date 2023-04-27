package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int trueKey = Biscuit.randomDeathKey(100000, 999999);
        ConsoleColors.writeString("Biscuit-ключ доступа: " + trueKey, ConsoleColors.YELLOW);
        Scanner scan = new Scanner(System.in);
        ConsoleColors.writeString("Внимание!\nВаш процессор может не справиться со слишком большим количеством потоков!", ConsoleColors.YELLOW);
        ConsoleColors.writeString("Кол-во смертоносных потоков: ", ConsoleColors.CYAN);
        long threads = scan.nextLong();
        ConsoleColors.writeString("[Biscuit] Ключ доступа: ", ConsoleColors.PURPLE);
        Integer key = scan.nextInt();
        if (key == trueKey){
            ConsoleColors.writeString("АЛГОРИТМ НАГРУЗКИ ПРОЦЕССОРА ЗАПУЩЕН ["+threads+" ПОТОКОВ]", ConsoleColors.YELLOW);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < threads ; i++){
                new PoisonThread("PoisonThread №" + i).start();
            }
        } else {
            ConsoleColors.writeString("Неверный Biscuit-ключ. Выполнение программы остановлено.", ConsoleColors.RED);
        }

    }
}