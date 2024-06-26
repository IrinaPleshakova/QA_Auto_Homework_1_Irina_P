/*Задача 1: Магічне яблуко
В уявному світі є магічне яблуко, яке може дати різну кількість енергії в залежності від того, яка година зараз.
Якщо це ранок (з 6 до 12 годин), яблуко дає 10 одиниць енергії.
Вдень (з 12 до 18 годин) – 20 одиниць енергії.
Ввечері (з 18 до 24 годин) – 30 одиниць енергії.
Вночі (з 0 до 6 годин) – 5 одиниць енергії.
Напишіть програму, яка приймає поточний час (годину в 24-годинному форматі) і виводить, скільки енергії ви отримаєте від магічного яблука.*/

import java.util.Scanner;

public class MagicApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущее время (0-23): ");
        int hour = scanner.nextInt();

        int energy = 0;
        if (hour >= 6 && hour < 12) {
            energy = 10;
            } else if (hour >= 12 && hour < 18) {
            energy = 20;
            } else if (hour >= 18 && hour < 24) {
            energy = 30;
            } else if (hour >= 0 && hour < 6) {
            energy = 5;
        }
        else {
            System.out.println("Пожалуйста введите значение от 0 до 23!!!");}

    System.out.println("Вы получаете " + energy + " единиц энергии от магического яблока");}
    }