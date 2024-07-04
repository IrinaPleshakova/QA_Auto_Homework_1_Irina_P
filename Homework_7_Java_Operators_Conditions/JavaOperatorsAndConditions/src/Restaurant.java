import java.util.Scanner;

/**
 * Задача 3: Вибір страви
 * Ви в ресторані і обираєте страву на основі типу страви, який вам подобається.
 * Є чотири основні типи страв: закуска, основна страва, десерт і напій.
 * В залежності від обраного типу, програма виведе відповідну страву.
 * Напишіть програму, яка приймає тип страви (ціле число від 1 до 4) і виводить назву страви з використанням оператора switch.
 */
public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете тип блюда (1 - закуска, 2 - основное блюдо, 3 - десерт, 4 - напиток): ");
        int dishType = scanner.nextInt();
        String dish;

        switch (dishType) {
            case 1:
                dish = "Закуска: Салат Сельдь под шубой";
                break;
            case 2:
                dish = "Основное блюдо: Борщ со сметаной";
                break;
            case 3:
                dish = "Десерт: Киевский торт";
                break;
            case 4:
                dish = "Напиток: Узвар";
                break;
            default:
                dish = "Неизвестный тип блюда";
        }

        System.out.println("Вы выбрали " + dish);
    }
}