public class Skill {
    private String name;
    private int damage;
    private int speed;
    private int manacost;

    public Skill(String name, int damage, int speed, int manacost) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
        this.manacost = manacost;
    }

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
