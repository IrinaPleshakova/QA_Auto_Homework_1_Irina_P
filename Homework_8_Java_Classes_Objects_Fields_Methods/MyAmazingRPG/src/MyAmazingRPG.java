import java.util.ArrayList;
import java.util.Random;

/**
 * Механика игры:
 * 1. Пока есть живые герои и враги, случайным образом выбирается герой и враг для сражения.
 * 2. Выводится информация о выбранных персонажах.
 * 3. Проходит битва между выбранными персонажами, пока один из них не умрет. Во время битвы каждый персонаж поочередно
 * атакует другого, и после каждой атаки выводится текущее состояние персонажей.
 * 4. Значение здоровья у победившего персонажа не восстанавливается (т.е. в следующем бою этот персонаж будет иметь
 * столько здоровья, сколько у него осталось после предыдущей битвы).
 * 5. Если герои побеждают, то последний герой должен сразится с супермонстром.
 * Результаты битвы:
 * 1. После завершения битвы проверяется, кто победил. Проигравший удаляется из списка героев или врагов.
 * 2. Если герои или враги закончились, выводится соответствующее сообщение о победе или поражении.
 * 3. После битвы с супермонстром выводится сообщение о победе или поражении.
 */
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

        //Создаю супермонстра - босса
        Character darkOverlord = new Character("Dark Overlord", 200, 50, 20);


        System.out.println("Общее количество созданных персонажей: " + Character.checkCharacterCount());
        Character lastHero = null;
        Random random = new Random();
        while (heroes.size() > 0 && enemies.size() > 0) {
            Character hero = heroes.get(random.nextInt(heroes.size()));
            Character enemy = enemies.get(random.nextInt(enemies.size()));

            System.out.println("----------------------------------------------------------------");
            System.out.println("\nВыбранный герой: ");
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

            System.out.println("\nБитва завершена!");

            if (hero.isAlive) {
                System.out.println("\n" + hero.name + " победил!");
                lastHero = hero;
            } else {
                System.out.println("\n" + enemy.name + " победил!");

            }
            if (!hero.isAlive) {
                System.out.println("\n" + hero.name + " проиграл и будет удален из списка героев!");
                heroes.remove(hero);
            } else {
                System.out.println("\n" + enemy.name + " проиграл и будет удален из списка врагов!");
                enemies.remove(enemy);
            }
        }
        if (heroes.size() > 0) {
            System.out.println("\nПОЗДРАВЛЯЮ! Герои победили!");
            System.out.println("ТЕПЕРЬ ВАМ ДОСТУПНА БИТВА С СУПЕРМОНСТРОМ!!!");
            System.out.println("\nПоследний выживший герой: " + lastHero.name);
            System.out.println("\nБитва с супермонстром: " + darkOverlord.name);

            while (lastHero.checkLifeStatus() && darkOverlord.checkLifeStatus()) {
                lastHero.attack(darkOverlord);
                System.out.println("\nСостояние персонажей после атаки героя: ");
                lastHero.displayStatus();
                darkOverlord.displayStatus();
                if (darkOverlord.checkLifeStatus()) {
                    darkOverlord.attack(lastHero);
                    System.out.println("\nСостояние персонажей после атаки супер монстра: ");
                    lastHero.displayStatus();
                    darkOverlord.displayStatus();
                }
            }
            System.out.println("\nФинальная битва завершена!");

            if (lastHero.isAlive) {
                System.out.println("\n" + lastHero.name + " победил супер монстра!");
                System.out.println("\nПОЗДРАВЛЯЕМ! Герои одержали окончательную победу!");
                System.out.println("Ты невероятно крут!!!");
            } else {
                System.out.println("\n" + darkOverlord.name + " победил последнего героя!");
                System.out.println("\nМОНСТРЫ ОДЕРЖАЛИ ОКОНЧАТЕЛЬНУЮ ПОБЕДУ!!! *рыдающий смайл*");
            }
        }
        else{
            System.out.println("\nОЧЕНЬ ЖАЛЬ! Монстры в этот раз были круче!");
            System.out.println("ИДИ ПОДКАЧАЙСЯ :Р и приходи снова :)");
        }
    }
}
