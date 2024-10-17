import java.util.Objects;

public class LivingBeingEssence extends Essence {
    private String nickname;
    private String ID;
    private int age;
    private String affinity;
    EssenceType essenceType = new EssenceType();
    private boolean canGrantBless;
    private boolean canBePatronGod;
    private boolean hasPatronGod;

    public LivingBeingEssence(boolean isMortal, String baseType, String nickname, String ID, int age, String affinity, String race, boolean canGrantBless, boolean canBePatronGod, boolean hasPatronGod) {
        super(isMortal, false, true, true, false, true);
        this.nickname = nickname;
        this.ID = ID;
        this.age = age;
        this.affinity = affinity;
        this.race.setRace(race);
        this.essenceType.setType(baseType);

        if (!isMortal && !canGrantBless && !canBePatronGod && !hasPatronGod){
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

    public void ascend (String newType, int strength, int dexterity, int constitution, int intelligence,int wisdom,int charisma){
        if (Objects.equals(newType, "Mortal")){
            this.essenceType.setType(newType);
            this.attributes.setMortalAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Creature")){
            this.essenceType.setType(newType);
        }
        if (Objects.equals(newType, "Servant")){
            this.attributes.setServantAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
            this.essenceType.setType(newType);
        }
        if (Objects.equals(newType, "God")){
            this.essenceType.setType(newType);
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
