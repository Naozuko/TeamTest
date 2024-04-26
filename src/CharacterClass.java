public enum CharacterClass {
    MAGE("Mage", 10, 30, 15, 100),
    WARRIOR("Warrior", 25, 10, 20, 50);

    private String name;
    private int strength;
    private int intelligence;
    private int agility;
    private int manapool;

    CharacterClass(String name, int strength, int intelligence, int agility, int manapool) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.manapool = manapool;
    }


    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getManapool() {
        return manapool;
    }
}
