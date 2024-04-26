import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the RPG Game!");

        String name = InputHelper.getInput("Enter your character's name: ");
        CharacterClass chosenClass = CharacterClass.valueOf(InputHelper.getInput("Choose your class (Mage/Warrior): ").toUpperCase());

        Character player = new Character(name, chosenClass);
        List<Skill> availableSkills = SkillsRepository.getAvailableSkills();

        System.out.println("Select four skills from the following list (enter the number of the skill):");
        for (int i = 0; i < availableSkills.size(); i++) {
            Skill skill = availableSkills.get(i);
            System.out.println((i + 1) + ". " + skill.getName() + " (Damage: " + skill.getDamage() + ", Speed: " + skill.getSpeed() + ", Mana Cost: " + skill.getManacost() + ")");
        }

        Set<Integer> chosenSkillsIndices = new HashSet<>();
        while (player.getSkills().size() < 4) {
            int skillChoice = Integer.parseInt(InputHelper.getInput("Choose skill #" + (player.getSkills().size() + 1) + ": ")) - 1;

            if (skillChoice >= 0 && skillChoice < availableSkills.size() && chosenSkillsIndices.add(skillChoice)) {
                player.addSkill(availableSkills.get(skillChoice));
            } else {
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
