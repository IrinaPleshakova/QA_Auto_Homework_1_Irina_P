/**
 * Ідеї на домашку
 * Завдання 1: Напишіть оператор if-else, щоб перевірити, чи є
 * число додатнім, від'ємним або нульовим
 *
 * Завдання 2: Використовуйте оператор switch, щоб вивести
 * назву місяця за цілим числом (1 для січня, 2 для лютого і т.д.)
 *
 * Завдання 3: Напишіть оператор if-else if-else, щоб категоризувати
 * вікові групи (дитина, підліток, дорослий, пенсіонер)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Завдання 1
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner1.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число нулевое");
        }
//        }
//    }

        // Завдання 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner2.nextInt();

        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Неверный номер месяца");
                break;
        }
//   }
//}

        // Завдання 3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner3.nextInt();

        if (age < 13) {
            System.out.println("Ребенок");
        } else if (age >= 13 && age < 18) {
            System.out.println("Подросток");
        } else if (age >= 18 && age < 60) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }

    }
}