/** Задача 2: Похід до кав’ярні
 * Уявіть, що ви йдете до кав’ярні і обираєте між трьома напоями: еспресо, лате та капучіно.
 * Кожен напій має свою вартість. Еспресо коштує 3 долари, лате – 4 долари, капучіно – 5 доларів.
 * Ваша мета – порахувати загальну вартість вашого замовлення.
 * Напишіть програму, яка приймає кількість кожного напою і виводить загальну вартість замовлення.
 * Можна прописати логіку так, щоб: а) після введення відємної кількості чашок користувачу друкувалось повідомлення і
 * програма завершувала роботу
 */

import java.util.Scanner;

public class CoffeeShopWithReturn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int espressoCost = 3;
        int latteCost = 4;
        int cappuccinoCost = 5;

        //Вариант 1 (с этого места можно закомментировать и раскоментировать Вариант 2)
        System.out.println("Введите количество эспрессо: ");
        int espresso = scanner.nextInt(); // запам*ятовуємо скільки чашок еспресо
        if (espresso <0) {
            System.out.println("Количество чашок не может быть отрицательным. Программа завершена.");
            return;
        }

        System.out.println("Введите количество латте: ");
        int latte = scanner.nextInt(); // скільки лате
        if (latte <0) {
            System.out.println("Количество чашок не может быть отрицательным. Программа завершена.");
            return;
        }

        System.out.println("Введите количество капучино: ");
        int cappuccino = scanner.nextInt();  // скільки капучино
        if (espresso<0){
            System.out.println("Количество чашок не может быть отрицательным. Программа завершена.");
            return;
        }

        int totalCost = (espressoCost * espresso) + (latteCost * latte) + (cappuccinoCost * cappuccino);
        System.out.println("Общая сумма вашего заказа: " + totalCost + " долларов.");
    }
}
////  Вариант 2
////  Думаю можно использовать еще такой вариант, он выглядит немного компактнее, чем вариант с if под каждой переменной
//        System.out.println("Введите количество эспрессо: ");
//        int espresso = scanner.nextInt(); // запам*ятовуємо скільки чашок еспресо
//
//        System.out.println("Введите количество латте: ");
//        int latte = scanner.nextInt(); // скільки лате
//
//        System.out.println("Введите количество капучино: ");
//        int cappuccino = scanner.nextInt();  // скільки капучино
//
//        if (espresso < 0 || latte < 0 || cappuccino < 0) {
//            System.out.println("Количество чашок не может быть отрицательным. Программа завершена.");
//            return;
//        }
//
//        int totalCost = (espressoCost * espresso) + (latteCost * latte) + (cappuccinoCost * cappuccino);
//        System.out.println("Общая сумма вашего заказа: " + totalCost + " долларов.");
//    }
//}