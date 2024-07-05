public class Main {
    public static void main(String[] args) {
        // Задача 1: Соревнование между роботами
        System.out.println("Задача 1: Соревнование между роботами");
        int[] weights = {300, 450, 200, 500, 350};
        int maxWeight = 0;
        int strongestRobot = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                strongestRobot = i + 1;
            }
        }
        System.out.println("Самый сильный робот: Робот " + strongestRobot + ", вес: " + maxWeight + " кг");

        // Задача 2: Отслеживание потребления воды
        System.out.println("\nЗадача 2: Отслеживание потребления воды");
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int totalWater = 0;
        int i = 0;

        while (i < waterIntake.length) {
            if (waterIntake[i] >= 2) {
                totalWater = totalWater + waterIntake[i];
            }
            i++;
        }

        System.out.println("Общее количество выпитых стаканов воды за неделю: " + totalWater);

        // Задача 3: Поиск студента по номеру зачетной книжки
        System.out.println("\nЗадача 3: Поиск студента по номеру зачетной книжки");
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int searchID = 54321;
        boolean found = false;

        for (int id : studentIDs) {
            if (id == searchID) {
                System.out.println("Студент с номером зачетной книжки " + searchID + " найден.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Студент с номером зачетной книжки " + searchID + " не найден.");
        }
    }
}
