/**
 * Задача 2: Похід до кав’ярні
 * Уявіть, що ви йдете до кав’ярні і обираєте між трьома напоями: еспресо, лате та капучіно.
 * Кожен напій має свою вартість. Еспресо коштує 3 долари, лате – 4 долари, капучіно – 5 доларів.
 * Ваша мета – порахувати загальну вартість вашого замовлення.
 * Напишіть програму, яка приймає кількість кожного напою і виводить загальну вартість замовлення.
 */
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int espressoCost = 3;
        int latteCost = 4;
        int cappuccinoCost = 5;

        System.out.println("Введите количество эспрессо: ");
        int espresso = scanner.nextInt(); // запам*ятовуємо скільки чашок еспресо
        System.out.println("Введите количество латте: ");
        int latte = scanner.nextInt(); // скільки лате
        System.out.println("Введите количество капучино: ");
        int cappuccino = scanner.nextInt();  // скільки капучино

        int totalCost = (espressoCost * espresso) + (latteCost * latte) + (cappuccinoCost * cappuccino);
        System.out.println("Общая сумма вашего заказа: " + totalCost + " долларов.");
    }
}
