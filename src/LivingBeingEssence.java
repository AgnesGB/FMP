import java.util.Objects;

public class LivingBeingEssence extends Essence {
    private String nickname;
    private String ID;
    private int age;
    private String affinity;
    private boolean canGrantBless;
    private boolean canBePatronGod;
    private boolean hasPatronGod;

    public LivingBeingEssence(boolean isMortal, String nickname, String ID, int age, String affinity, String race, boolean canGrantBless, boolean canBePatronGod, boolean hasPatronGod) {
        super(isMortal, false, true, true, false, true);
        this.nickname = nickname;
        this.ID = ID;
        this.age = age;
        this.affinity = affinity;
        this.race.setRace(race);
        String baseType = "Mortal";
        this.essenceType.setType(baseType);

        if (!isMortal && !canGrantBless && !canBePatronGod && !hasPatronGod){
            baseType = "Mortal";
            this.essenceType.setType(baseType);
        }
        if (isMortal && canGrantBless && !canBePatronGod && !hasPatronGod){
            baseType = "Creature";
            this.essenceType.setType(baseType);
        }
        if (isMortal && canGrantBless && !canBePatronGod && hasPatronGod){
            baseType = "Servant";
            this.essenceType.setType(baseType);
        }
        if (isMortal && canGrantBless && canBePatronGod && !hasPatronGod){
            baseType = "God";
            this.essenceType.setType(baseType);
        }
    }

    public String getNickname() {
        return nickname;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getAffinity() {
        return affinity;
    }

    public String LivingEssenceCode() {
        return "LivingBeingEssence{" +
                "nickname='" + nickname + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", affinity='" + affinity + '\'' +
                '}';
    }
}
