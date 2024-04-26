import java.util.ArrayList;
import java.util.List;

public class SkillsRepository {

    private static List<Skill> skills = new ArrayList<>();


    static {
        //add new skills to the skills array. Skill and SkillsRepository are related.
        //create 8 skills i.e. Fireball

    }

    public static List<Skill> getAvailableSkills() {
        return new ArrayList<>(skills);  // Return a copy to prevent external modifications
    }
}
