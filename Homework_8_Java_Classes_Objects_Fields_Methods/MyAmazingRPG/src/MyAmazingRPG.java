import java.util.ArrayList;
import java.util.Random;

public class MyAmazingRPG {
    public static void main(String[] args) {
        //Создаю список героев
        ArrayList<Character> heroes = new ArrayList<>();
        Character codeWarrior = new Character("Code Warrior", 120, 30, 15);
        Character bugHunter = new Character("Bug Hunter", 100, 20, 10);
        Character serverSavior = new Character("Server Savior", 90, 25, 20);
        Character pixelMage = new Character("Pixel Mage", 90, 20, 10);
        Character taskMaster = new Character("Task Master", 80, 30, 50);
        heroes.add(codeWarrior);
        heroes.add(bugHunter);
        heroes.add(serverSavior);
        heroes.add(pixelMage);
        heroes.add(taskMaster);

        //Создаю список врагов
        ArrayList<Character> enemies = new ArrayList<>();
        Character juniorBug = new Character("Junior Bug", 80, 10, 5);
        Character codeCrasher = new Character("Code Crasher", 90, 20, 10);
        Character legacyCodeMonster = new Character("Legacy Code Monster", 70, 40, 20);
        Character nullPointerException = new Character("Null Pointer Exception", 80, 20, 20);
        enemies.add(juniorBug);
        enemies.add(codeCrasher);
        enemies.add(legacyCodeMonster);
        enemies.add(nullPointerException);

        Random random = new Random();
        Character hero = heroes.get(random.nextInt(heroes.size()));
        Character enemy = enemies.get(random.nextInt(enemies.size()));

        System.out.println("Выбранный герой: ");
        hero.displayStatus();
        System.out.println("Выбранный противник: ");
        enemy.displayStatus();

//        System.out.println("\nИсходное состояние персонажей:");
//        codeWarrior.displayStatus();
//        bugHunter.displayStatus();
//        juniorBug.displayStatus();
//        legacyCodeMonster.displayStatus();

        System.out.println("\nНачало битвы между " + hero.name + " и " + enemy.name + "\n");

        while (hero.checkLifeStatus() && enemy.checkLifeStatus()) {
            hero.attack(enemy);
            if (enemy.checkLifeStatus()) {
                enemy.attack(hero);
            }

            System.out.println("\nСостояние персонажей после атаки: ");
            hero.displayStatus();
            enemy.displayStatus();

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