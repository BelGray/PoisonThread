package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int trueKey = Biscuit.randomDeathKey(100000, 999999);
        System.out.println("Biscuit-ключ доступа: " + trueKey);
        Scanner scan = new Scanner(System.in);
        System.out.println("Количество смертоносных потоков: ");
        long threads = scan.nextLong();
        System.out.println("Введите ключ доступа: ");
        Integer key = scan.nextInt();
        if (key == trueKey){
            System.out.println("Запущен алгоритм нагрузки процессора");
            for (int i = 0; i < threads ; i++){
                new PoisonThread("PoisonThread №" + i).start();
            }
        }

    }
}