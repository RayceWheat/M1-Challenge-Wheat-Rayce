package classes;

public class Farmer extends BasicClass{

    private boolean plowing;

    private boolean harvesting;

    private int stockOfFood;

//    private void attackAnotherCharacter(){
//        return;
//    }

    public boolean startPlowing(){
        System.out.println("Starting to plow the field has caused " + this.getName() + " to lose 10 stamina.");

        int currentStamina = this.getStamina();

        currentStamina = currentStamina - 10;

        this.setStamina(currentStamina);

        System.out.println(this.getName() + " now has " + this.getStamina() + " stamina.");

        plowing = true;

        return plowing;
    }

    public boolean stopPlowing(){
        System.out.println(this.getName() + " has stopped plowing.");

        plowing = false;

        return plowing;

    }

    public boolean startHarvesting(){
        System.out.println("Starting to harvest the field has caused " + this.getName() + " to lose 10 stamina.");

        int currentStamina = this.getStamina();

        currentStamina = currentStamina - 10;

        this.setStamina(currentStamina);

        System.out.println(this.getName() + " now has " + this.getStamina() + " stamina.");

        harvesting = true;

        return harvesting;
    }

    public boolean stopHarvesting(){
        stockOfFood = stockOfFood + 10;

        harvesting = false;

        System.out.println("Farmer " + this.getName() + " has harvested 10 units food and now has " +
                stockOfFood + " units of food.");

        return harvesting;
    }

    public BasicClass farmerCanAttack(BasicClass defender){
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


    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }


    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int stockOfFood) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);

        this.stockOfFood = stockOfFood;
    }

    public Farmer(String name, int stockOfFood){
        super(name);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);

        this.stockOfFood = stockOfFood;

    }

}
