import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the RPG Game!");

        // Makes the player add their name
        String name = InputHelper.getInput("Enter your character's name: ");
        // Makes player pick their class
        CharacterClass chosenClass = CharacterClass.valueOf(InputHelper.getInput("Choose your class (Mage/Warrior/Monk): ").toUpperCase());

        // Creates an object
        Character player = new Character(name, chosenClass);
        // Duplicates the list
        List<Skill> availableSkills = SkillsRepository.getAvailableSkills();


        System.out.println("Select four skills from the following list (enter the number of the skill):");
        // prints all the skills with the stats
        for (int i = 0; i < availableSkills.size(); i++) {
            Skill skill = availableSkills.get(i);
            System.out.println((i + 1) + ". " + skill.getName() + " (Damage: " + skill.getDamage() + ", Speed: " + skill.getSpeed() + ", Mana Cost: " + skill.getManacost() + ")");
        }

        // Creates a list where ALL the items are UNIQUE
        Set<Integer> chosenSkillsIndices = new HashSet<>();

        // loops until the player has 4 skills
        while (player.getSkills().size() < 4) {
            // Makes the player input the Number of the skill they want to chose
            int skillChoice = Integer.parseInt(InputHelper.getInput("Choose skill #" + (player.getSkills().size() + 1) + ": ")) - 1;

            // checks if all the conditions are meet

            // skillChoice >= 0
            // Checks if the user has picked a valid number

            // skillChoice < availableSkills.size()
            // Checks if the number they've inputted is not larger than the list
            // list size = 6 => index {0,1,2,3,4,5}
            // user input = 7 => index of 6, so it's invalid number

            // chosenSkillsIndices.add(skillChoice)
            // checks the list if that skill is already in the HashSet
            if (skillChoice >= 0 && skillChoice < availableSkills.size() && chosenSkillsIndices.add(skillChoice)) {
                // Adds the skill to the players object skills list
                player.addSkill(availableSkills.get(skillChoice));
            } else {
                // tells the player they've chosen an invalid skill
                System.out.println("Invalid selection or duplicate skill chosen. Please choose again.");
            }
        }

        // Display character details
        System.out.println("Your character details:");
        System.out.println("Name: " + player.getName());
        System.out.println("Class: " + player.getCharacterClass().getName());
        System.out.println("Attributes: Agility: " + chosenClass.getAgility() + " strength: " + chosenClass.getStrength() + " intelligence: " + chosenClass.getIntelligence() + " mana: " + chosenClass.getManapool());
        for (Skill skill : player.getSkills()) {
            System.out.println("Skill: " + skill.getName() + " (Damage: " + skill.getDamage() + ", Speed: " + skill.getSpeed() + ", Mana Cost: " + skill.getManacost() + ")");
        }
    }
}
