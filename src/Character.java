import java.util.ArrayList;
import java.util.List;

//Why is this needed?
public class Character {
    private String name;
    private CharacterClass characterClass;
    private List<Skill> skills;

    public Character(String name, CharacterClass characterClass) {
        this.name = name;
        this.characterClass = characterClass;
        this.skills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public String getName() {
        return name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
