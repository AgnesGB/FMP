public class NonLivingBeingEssence extends Essence {
    private String ID;
    private int age;
    private String affinity;
    private EssenceType amountOfEssence;
    private Race race;

    public NonLivingBeingEssence(boolean isMortal, String ID, int age, String affinity, String amountOfEssence) {
        super(isMortal, false, true, false, true, false);
        this.ID = ID;
        this.age = age;
        this.affinity = affinity;
        this.amountOfEssence.setType(amountOfEssence);
        this.race = new Race();
    }
}
