package classes;

public class Constable extends BasicClass{

    private String jurisdiction;

    public BasicClass constableAttackAnotherCharacter(BasicClass defender){
        int newStamina = this.getStamina() - 10;

        this.setStamina(newStamina);

        System.out.println(this.getName() + " has used 10 stamina to attack " + defender.getName() + " for "
            + this.getAttackPower() + " damage!"
        );

        int newHealth = defender.getHealth() - this.getAttackPower();

        defender.setHealth(newHealth);

        System.out.println(defender.getName() + " now has " + defender.getHealth() + " hp!");

        return defender;
    }

    public BasicClass constableArrestAnotherCharacter(BasicClass criminal){
        int newStamina = this.getStamina() - 10;

        this.setStamina(newStamina);

        System.out.println(this.getName() + " has used 10 stamina to arrest " + criminal.getName());

        criminal.setArrested(true);

        return criminal;
    }


    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.setStrength(60);
        this.setHealth(100);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.jurisdiction = jurisdiction;

    }

    public Constable(String name, String jurisdiction){
        super(name);
        this.setStrength(60);
        this.setHealth(100);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.jurisdiction = jurisdiction;

    }
}
