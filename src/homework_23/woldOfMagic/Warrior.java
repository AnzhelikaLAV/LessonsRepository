package homework_23.woldOfMagic;

public class Warrior extends GameCharacter{



    public Warrior(int health) {
        super(health);
    }

    @Override
    public void attack() {
        System.out.println("Warrior attack with " + health);
    }
}