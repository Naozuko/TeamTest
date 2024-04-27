import java.util.ArrayList;
import java.util.List;

public class SkillsRepository {

    private static List<Skill> skills = new ArrayList<>();


    static {
        //add new skills to the skills array. Skill and SkillsRepository are related.
        //create 8 skills i.e. Fireball
        skills.add(new Skill("Fireball",10,1,8));

        skills.add(new Skill("Slash",3,7,0));

        skills.add(new Skill("MagicMissile",1,2,1));

        skills.add(new Skill("Kick",3,10,0));

        skills.add(new Skill("Punch",2,10,0));

        skills.add(new Skill("LighteningBolt",4,10,3));

        skills.add(new Skill("ChainLighten",4,10,9));

        skills.add(new Skill("Gun",10,10,0));

        skills.add(new Skill("Poke",1,10,0));
    }

    public static List<Skill> getAvailableSkills() {
        return new ArrayList<>(skills);  // Return a copy to prevent external modifications
    }
}


//        this.damage = damage;
//        this.speed = speed;
//        this.manacost = manacost;