import java.util.Scanner;

/** Задача 2: Похід до кав’ярні
 * Уявіть, що ви йдете до кав’ярні і обираєте між трьома напоями: еспресо, лате та капучіно.
 * Кожен напій має свою вартість. Еспресо коштує 3 долари, лате – 4 долари, капучіно – 5 доларів.
 * Ваша мета – порахувати загальну вартість вашого замовлення.
 * Напишіть програму, яка приймає кількість кожного напою і виводить загальну вартість замовлення.
 * Можна прописати логіку так, щоб: б) після введення відємної кількості чашок користувача ми попереджаємо, що так
 * робити не можна, але автоматично інвертуємо знак змінної щоб зробити кількість чашок додатньою
 */

public class CoffeeShopWithInversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int espressoCost = 3;
        int latteCost = 4;
        int cappuccinoCost = 5;

        System.out.println("Введите количество эспрессо: ");
        int espresso = scanner.nextInt();
        if (espresso < 0) {
            System.out.println("Количество чашок не может быть отрицательным. Значение инвертировано.");
            espresso = -espresso;
        }

        System.out.println("Введите количество латте: ");
        int latte = scanner.nextInt();
        if (latte < 0) {
            System.out.println("Количество чашок не может быть отрицательным. Значение инвертировано.");
            latte = -latte;
        }

        System.out.println("Введите количество капучино: ");
        int cappuccino = scanner.nextInt();
        if (cappuccino < 0) {
            System.out.println("Количество чашок не может быть отрицательным. Значение инвертировано.");
            cappuccino = -cappuccino;
        }
        int totalCost = (espressoCost * espresso) + (latteCost * latte) + (cappuccinoCost * cappuccino);
        System.out.println("Общая сумма вашего заказа: " + totalCost + " долларов.");
    }
}
