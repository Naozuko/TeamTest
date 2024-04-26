public enum CharacterClass {

    //Create your Characters classes like Mage, Warrior, Monk etc.
    //The current class is within an ENUM. What parameters does the CharacterClass expect?

    private String name;
    private int strength;
    private int intelligence;
    private int agility;
    private int manapool;


    CharacterClass(String name, int strength, int intelligence, int agility, int manapool) {
        //set the private variables equal to the received parameters.
        //this?

    }


    //Make getters so that the other files are able to retrieve data from EACH of the private variables.
    //use the naming convention: getStrength, getName, etc.
}
