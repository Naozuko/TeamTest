import java.util.ArrayList;
import java.util.List;

public class SkillsRepository {
    private static List<Skill> skills = new ArrayList<>();

    static {
        skills.add(new Skill("Fireball", 30, 2, 25));
        skills.add(new Skill("Ice Blast", 20, 3, 15));
        skills.add(new Skill("Lightning Strike", 25, 4, 20));
        skills.add(new Skill("Earthquake", 35, 1, 30));
        skills.add(new Skill("Slash", 15, 5, 0));
        skills.add(new Skill("Shield Bash", 10, 1, 5));
        skills.add(new Skill("Healing Light", 0, 3, 20));
        skills.add(new Skill("Wind Fury", 25, 4, 15));
    }

    public static List<Skill> getAvailableSkills() {
        return new ArrayList<>(skills);  // Return a copy to prevent external modifications
    }
}
