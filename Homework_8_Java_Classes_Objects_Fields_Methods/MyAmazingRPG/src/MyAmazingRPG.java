import java.util.ArrayList;
import java.util.List;

public class MyAmazingRPG {
    public static void main(String[] args) {
        Character codeWarrior = new Character("Кодовый Воитель", 120, 30, 15); //герой
        Character bugHunter = new Character("Охотник за Багами", 100, 20, 10); //герой


        Character juniorBug = new Character("Юный Баг", 80, 10, 5); //враг
        Character codeCrasher = new Character("Кодолом", 90, 20, 10); //враг

        System.out.println("Исходное состояние персонажей:");
        codeWarrior.displayStatus();
        bugHunter.displayStatus();
        juniorBug.displayStatus();
        codeCrasher.displayStatus();

        System.out.println("\nНачало битвы между " + codeWarrior.name + " и " + juniorBug.name + "\n");

        while (codeWarrior.checkLifeStatus() && juniorBug.checkLifeStatus()) {
            codeWarrior.attack(juniorBug);
            if (juniorBug.checkLifeStatus()) {
                juniorBug.attack(codeWarrior);
            }

            System.out.println("\nСостояние персонажей после атаки: ");
            codeWarrior.displayStatus();
            juniorBug.displayStatus();

        }

        if (codeWarrior.isAlive) {
            System.out.println("\n" + codeWarrior.name + " победил!");
        }
        else {
            System.out.println("\n" + juniorBug.name + " победил!");

        }
        System.out.println("\nБитва завершена!");
        System.out.println("Общее количество созданных персонажей: " + Character.checkCharacterCount());
    }
}