public class Attributes {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Attributes() {
        strength = 0;
        dexterity = 0;
        constitution = 0;
        intelligence = 0;
        wisdom = 0;
        charisma = 0;
    }

    public void setAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setStrength(strength);
        setDexterity(dexterity);
        setConstitution(constitution);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        setCharisma(charisma);

        //Limit attributes to 7.
        if (strength > 7){
            throw new RuntimeException("Your strength is greater than 7, please, do it again.");
        }
        if (dexterity > 7){
            throw new RuntimeException("Your dexterity is greater than 7, please, do it again.");
        }
        if (constitution > 7){
            throw new RuntimeException("Your constitution is greater than 7, please, do it again.");
        }
        if (intelligence > 7){
            throw new RuntimeException("Your intelligence is greater than 7, please, do it again.");
        }
        if (wisdom > 7){
            throw new RuntimeException("Your wisdom is greater than 7, please, do it again.");
        }
        if (charisma > 7){
            throw new RuntimeException("Your charisma is greater than 7, please, do it again.");
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
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Mortals to 10.
        if (sumAttributes() > 10) {
            throw new RuntimeException("Your attributes exceed 10 points, please try again.");
        }
        if (sumAttributes() < 10) {
            throw new RuntimeException("Your attributes do not reach 10 points, please try again.");
        }
    }
    
    public void setEssenceExperimentAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Essence Experiment to 15.
        if (sumAttributes() > 12) {
            throw new RuntimeException("Your attributes exceed 12 points, please try again.");
        }
        if (sumAttributes() < 12) {
            throw new RuntimeException("Your attributes do not reach 12 points, please try again.");
        }
    }

    public void setServantAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Servant to 15.
        if (sumAttributes() > 15) {
            throw new RuntimeException("Your attributes exceed 15 points, please try again.");
        }
        if (sumAttributes() < 15) {
            throw new RuntimeException("Your attributes do not reach 15 points, please try again.");
        }
    }

    public void setAscendedServantAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Ascended Servant to 18.
        if (sumAttributes() > 18) {
            throw new RuntimeException("Your attributes exceed 15 points, please try again.");
        }
        if (sumAttributes() < 18) {
            throw new RuntimeException("Your attributes do not reach 15 points, please try again.");
        }
    }

    public void setDemiGodAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Demi God to 20.
        if (sumAttributes() > 20) {
            throw new RuntimeException("Your attributes exceed 20 points, please try again.");
        }
        if (sumAttributes() < 20) {
            throw new RuntimeException("Your attributes do not reach 20 points, please try again.");
        }
    }

    public void setLesserGodAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Lesser God to 22.
        if (sumAttributes() > 22) {
            throw new RuntimeException("Your attributes exceed 22 points, please try again.");
        }
        if (sumAttributes() < 22) {
            throw new RuntimeException("Your attributes do not reach 22 points, please try again.");
        }
    }

    public void setMiddleGodAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to MiddleGod to 25.
        if (sumAttributes() > 25) {
            throw new RuntimeException("Your attributes exceed 25 points, please try again.");
        }
        if (sumAttributes() < 25) {
            throw new RuntimeException("Your attributes do not reach 25 points, please try again.");
        }
    }

    public void setGreaterGodAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAttributes(strength, dexterity, constitution, intelligence, wisdom, charisma);

        // Limits sum of attributes to Greater God to 30.
        if (sumAttributes() > 30) {
            throw new RuntimeException("Your attributes exceed 30 points, please try again.");
        }
        if (sumAttributes() < 30) {
            throw new RuntimeException("Your attributes do not reach 30 points, please try again.");
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