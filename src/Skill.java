public class Skill {
    private String name;
    private int damage;
    private int speed;
    private int manacost;

    public Skill(String name, int damage, int speed, int manacost) {
        //set the private variables equal to the variables that have been passed through the Skill method
        this.name = name;
        this.damage = damage;
        this.speed = speed;
        this.manacost = manacost;
    }
    //Make methods so that the other files are able to retrieve data from EACH of the private variables.
    //use the same naming convention as CharacterClass.java

    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
    public int getSpeed() {
        return speed;
    }
    public int getManacost() {
        return manacost;
    }
}
