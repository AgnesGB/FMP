public class Attributes {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private EssenceType essenceType;

    public Attributes() {
        strength = 0;
        dexterity = 0;
        constitution = 0;
        intelligence = 0;
        wisdom = 0;
        charisma = 0;
    }

    public void setAtributes(int strength, int dexterity, int constitution, int intelligence,int wisdom,int charisma) {
        setStrength(strength);
        setDexterity(dexterity);
        setConstitution(constitution);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        setCharisma(charisma);

        //Limit attributes to 5.
        if (strength > 5){
            throw new RuntimeException("Your strength is greater than 5, please, do it again.");
        }
        if (dexterity > 5){
            throw new RuntimeException("Your dexterity is greater than 5, please, do it again.");
        }
        if (constitution > 5){
            throw new RuntimeException("Your constitution is greater than 5, please, do it again.");
        }
        if (intelligence > 5){
            throw new RuntimeException("Your intelligence is greater than 5, please, do it again.");
        }
        if (wisdom > 5){
            throw new RuntimeException("Your wisdom is greater than 5, please, do it again.");
        }
        if (charisma > 5){
            throw new RuntimeException("Your charisma is greater than 5, please, do it again.");
        }

        //Limit attributes to 0.
        if (strength < 0){
            throw new RuntimeException("Your strength is lesser than 0, please, do it again.");
        }
        if (dexterity < 0){
            throw new RuntimeException("Your dexterity is lesser than 0, please, do it again.");
        }
        if (constitution < 0){
            throw new RuntimeException("Your constitution is lesser than 0, please, do it again.");
        }
        if (intelligence < 0){
            throw new RuntimeException("Your intelligence is lesser than 0, please, do it again.");
        }
        if (wisdom < 0){
            throw new RuntimeException("Your wisdom is lesser than 0, please, do it again.");
        }
        if (charisma < 0){
            throw new RuntimeException("Your charisma is lesser than 0, please, do it again.");
        }

        if (strength+dexterity+constitution+intelligence+wisdom+charisma==0) {
            throw new RuntimeException("Your attributes are zero, please, do it again.");
        }
    }

    public void setMortalAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAtributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Mortals to 10.
        if (sumAttributes() > 10) {
            throw new RuntimeException("Your attributes exceed 10 points, please try again.");
        }
        if (sumAttributes() < 10) {
            throw new RuntimeException("your attributes do not reach 10 points, please try again.");
        }
    }

    public void setServantAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAtributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Servant to 15.
        if (sumAttributes() > 15) {
            throw new RuntimeException("Your attributes exceed 15 points, please try again.");
        }
        if (sumAttributes() < 15) {
            throw new RuntimeException("your attributes do not reach 15 points, please try again.");
        }
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int sumAttributes (){
        return (getStrength()+getDexterity()+getConstitution()+getIntelligence()+getWisdom()+getCharisma());
    }
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getConstitution() {
        return constitution;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getCharisma() {
        return charisma;
    }

    public String getAtributes() {
        return "Atributes{" +
                "Strength: " + strength +
                ", Dexterity: " + dexterity +
                ", Constitution: " + constitution +
                ", Intelligence" + intelligence +
                ", Wisdom: " + wisdom +
                ", Charisma: " + charisma +
                '}';
    }
}
