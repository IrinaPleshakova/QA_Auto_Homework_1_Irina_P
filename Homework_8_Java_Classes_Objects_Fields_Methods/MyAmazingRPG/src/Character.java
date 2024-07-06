public class Character {

	String name; //Ім'я персонажа.
	int health; //Кількість очок здоров'я персонажа.
	int strength; //Атрибут сили, який впливає на силу атаки.
	int defense; //Атрибут захисту, який впливає на зменшення шкоди.
//	boolean isInBattle = false; //Находится ли персонаж в бою? (по умолчанию не в бою)
	boolean isAlive = true; //Жив ли персонаж? (по умолчанию жив)
//	boolean isEnemy = false; //Враг ли это?
//	boolean isTeam = false; //Находится ли игрок в моей команде
	static int characterCount; //Статичне поле для відстеження кількості створених персонажів.

	public Character(String name, int health, int strength, int defense) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.defense = defense;
//        this.isInBattle = false; //по умолчанию персонаж не в бою
//        this.isAlive = true; //по умолчанию персонаж жив
		characterCount++;
	}

	/**
	 * Імітує атаку на іншого персонажа. Шкода, яка завдається, дорівнює силі атакуючого мінус захист захищаючого (але не менше 0).
	 *
	 * @param other
	 */
	public void attack(Character other) {
		int damage = this.strength - other.defense;
		if (damage < 0) ;
		{
			damage = 0;
		}
		other.takeDamage(damage);
		System.out.println(this.name + " атакует " + other.name + " на  " + damage + " урона.");
	}

	/**
	 * Зменшує здоров'я персонажа на величину шкоди.
	 *
	 * @param damage
	 */
	public void takeDamage(int damage,Character other) {
		other.health = other.health - damage;
		if (other.health <= 0) {
			other.isAlive = false;
		}
		System.out.println(other.name + " получает " + damage + " урон. Здоровье сейчас " + other.health);
	}

	/**
	 * Повертає true, якщо здоров'я персонажа більше 0, інакше false.
	 */
	public boolean checkLifeStatus() {
		return this.isAlive;
	}

	/**
	 * Виводить на екран ім'я персонажа, його здоров'я, силу та захист.
	 */
	public void displayStatus() {
		System.out.println("Имя персонажа " + this.name);
		System.out.println("Здоровье " + this.health);
		System.out.println("Сила " + this.strength);
		System.out.println("Защита " + this.defense);
		System.out.println("Жив" + this.isAlive);
	}
}
