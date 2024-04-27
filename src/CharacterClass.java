public enum CharacterClass {

    //Create your Characters classes like Mage, Warrior, Monk etc.
    //The current class is within an ENUM. What parameters does the CharacterClass expect?

    MAGE ("Mage",1,1,1,1),
    WARRIOR ("Warrior",2,2,2,2),
    MONK ("Monk",3,3,3,3);

    private String name;
    private int strength;
    private int intelligence;
    private int agility;
    private int manapool;



    CharacterClass(String name, int strength, int intelligence, int agility, int manapool) {
        //set the private variables equal to the received parameters.
        //this?
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence ;
        this.agility = agility;
        this.manapool = manapool;

    }
    //Make getters so that the other files are able to retrieve data from EACH of the private variables.
    //use the naming convention: getStrength, getName, etc.
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
