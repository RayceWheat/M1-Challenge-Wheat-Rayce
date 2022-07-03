package classes;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicClassTest {


    //Farmers Test
    @Test
    public void farmerCanPlow(){
        //Arrange
        Farmer bob = new Farmer("Bob", 30);

        boolean expectedOutput = true;
        //Act
        boolean actualOutput = bob.startPlowing();

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void farmerCanStopPlowing(){
        //Arrange
        Farmer bob = new Farmer("Bob", 30);

        boolean expectedOutput = false;
        //Act
        boolean actualOutput = bob.startPlowing();
        actualOutput = bob.stopPlowing();

        //Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void farmerCanStartHarvesting(){
        //Arrange
        Farmer bob = new Farmer("Bob", 30);

        boolean expectedOutput = true;
        //Act
        boolean actualOutput = bob.startHarvesting();

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void farmerCanStopHarvesting(){
        //Arrange
        Farmer bob = new Farmer("Bob", 30);

        boolean expectedOutput = false;
        //Act
        boolean actualOutput = bob.startHarvesting();
        actualOutput = bob.stopHarvesting();

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void farmerCanAttack(){
        //Arrange
        Farmer attacker = new Farmer("Attacker", 0);
        Farmer defender = new Farmer("Defender", 0);

        int healthBeforeAttack = defender.getHealth();

        //Act
        attacker.farmerCanAttack(defender);

        int healthAfterAttack = defender.getHealth();

        //Assert
        assertNotSame(healthBeforeAttack, healthAfterAttack);
    }


    //Constable tests

    @Test
    public void constableCanAttack(){
        //Arrange
        Constable attacker = new Constable("Attacker", "Jersey");
        Constable defender = new Constable("Defender", "York");

        int healthBeforeAttack = defender.getHealth();

        //Act
        attacker.constableAttackAnotherCharacter(defender);

        int healthAfterAttack = defender.getHealth();

        //Assert
        assertNotSame(healthBeforeAttack, healthAfterAttack);
    }

    @Test
    public void constableCanArrest(){
        //Arrange
        Constable police = new Constable("John", "California");
        BasicClass criminal = new BasicClass("Bobert");
        Farmer farmer = new Farmer("Farmer", 0);

        boolean expectedOutcome = true;
        //Act
        police.constableArrestAnotherCharacter(criminal);
        police.constableArrestAnotherCharacter(farmer);
        boolean actualOutcome = criminal.isArrested();


        //Assert
        assertEquals(expectedOutcome, actualOutcome);
    }

    //Warrior Tests
    @Test
    public void warriorCanAttack(){
        //Arrange
        Warrior warrior = new Warrior("Conan");
        BasicClass defender = new BasicClass("defender");


        int healthBeforeAttack = defender.getHealth();
        //
        warrior.warriorAttackAnotherCharacter(defender);
        int healthAfterAttack = defender.getHealth();

        assertNotSame(healthBeforeAttack, healthAfterAttack);
    }

}