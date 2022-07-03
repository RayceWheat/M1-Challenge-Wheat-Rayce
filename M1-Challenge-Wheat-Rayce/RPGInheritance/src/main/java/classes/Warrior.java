package classes;

public class Warrior extends BasicClass {

    int shieldStrength;

    public BasicClass warriorAttackAnotherCharacter(BasicClass defender){
        int newStamina = this.getStamina() - 10;

        this.setStamina(newStamina);

        System.out.println(this.getName() + " has attacked " + defender.getName() + " for "
                + this.getAttackPower() + " damage!"
        );

        int newHealth = defender.getHealth() - this.getAttackPower();

        defender.setHealth(newHealth);

        System.out.println(defender.getName() + " now has " + defender.getHealth() + " hp!");

        return defender;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;
    }

    public Warrior(String name) {
        super(name);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;
    }
}
