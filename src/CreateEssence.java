import java.util.Objects;
import java.util.Scanner;

public class CreateEssence extends LivingBeingEssence {
    private Bless bless;
    private String core;
    private boolean hasBless;
    private boolean isServant;
    private boolean isGod;

    public CreateEssence(boolean isMortal, String nickname, String ID, int age, String affinity, String race, boolean canGrantBless, boolean canBePatronGod, boolean hasPatronGod) {
        super(isMortal, nickname, ID, age, affinity, race, canGrantBless, canBePatronGod, hasPatronGod);
    }

    public void verifyAttributes (int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        if (Objects.equals(this.essenceType.getEssenceType(), "Mortal")){
            this.attributes.setMortalAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(this.essenceType.getEssenceType(), "Essence Experiment")){
            this.attributes.setEssenceExperimentAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(this.essenceType.getEssenceType(), "Servant")){
            this.attributes.setServantAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(this.essenceType.getEssenceType(), "Ascended Servant")){
            this.attributes.setAscendedServantAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(this.essenceType.getEssenceType(), "Demi God")){
            this.attributes.setDemiGodAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(this.essenceType.getEssenceType(), "Lesser God")){
            this.attributes.setLesserGodAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(this.essenceType.getEssenceType(), "Middle God")){
            this.attributes.setMiddleGodAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(this.essenceType.getEssenceType(), "Greater God")){
            this.attributes.setGreaterGodAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
    }

    public void ascend (String newType, int strength, int dexterity, int constitution, int intelligence,int wisdom,int charisma){
        if (Objects.equals(newType, "Mortal")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Essence Experiment")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Servant")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Ascended Servant")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Demi God")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Lesser God")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Middle God")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
        if (Objects.equals(newType, "Greater God")){
            this.essenceType.setType(newType);
            verifyAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);
        }
    }

}
