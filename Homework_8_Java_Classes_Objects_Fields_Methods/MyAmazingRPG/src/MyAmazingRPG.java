import java.util.ArrayList;
import java.util.Random;

public class MyAmazingRPG {
    public static void main(String[] args) {
        //Создаю список героев
        ArrayList<Character> heroes = new ArrayList<>();
        heroes.add(new Character("Code Warrior", 120, 30, 15));
        heroes.add(new Character("Bug Hunter", 100, 20, 10));
        heroes.add(new Character("Server Savior", 90, 25, 20));
        heroes.add(new Character("Pixel Mage", 90, 20, 10));
        heroes.add(new Character("Task Master", 80, 30, 50));

        //Создаю список врагов
        ArrayList<Character> enemies = new ArrayList<>();
        enemies.add(new Character("Junior Bug", 80, 10, 5));
        enemies.add(new Character("Code Crasher", 90, 20, 10));
        enemies.add(new Character("Legacy Code Monster", 70, 40, 20));
        enemies.add(new Character("Null Pointer Exception", 80, 20, 20));

        Random random = new Random();
        Character hero = heroes.get(random.nextInt(heroes.size()));
        Character enemy = enemies.get(random.nextInt(enemies.size()));

        System.out.println("Выбранный герой: ");
        hero.displayStatus();
        System.out.println("Выбранный противник: ");
        enemy.displayStatus();

        System.out.println("\nНачало битвы между " + hero.name + " и " + enemy.name + "\n");

        while (hero.checkLifeStatus() && enemy.checkLifeStatus()) {
            hero.attack(enemy);
            System.out.println("\nСостояние персонажей после атаки героя: ");
            hero.displayStatus();
            enemy.displayStatus();

            if (enemy.checkLifeStatus()) {
                enemy.attack(hero);
                System.out.println("\nСостояние персонажей после атаки противника: ");
                hero.displayStatus();
                enemy.displayStatus();
            }

        }

        if (hero.isAlive) {
            System.out.println("\n" + hero.name + " победил!");
        }
        else {
            System.out.println("\n" + enemy.name + " победил!");

        }
        System.out.println("\nБитва завершена!");
        System.out.println("Общее количество созданных персонажей: " + Character.checkCharacterCount());
    }
}