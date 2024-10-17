public class EssenceType {
    private String type;
    private int amountEssence;
    private Bless bless;

    public EssenceType() {
        this.type = "Mortal";
    }

    public void setType(String type) {
        this.type = type;

        switch (type){
            case "Greater God": this.amountEssence = 2000; break;
            case "Middle God": this.amountEssence = 1500; break;
            case "Lesser God": this.amountEssence = 1000; break;
            case "Demi God": this.amountEssence = 750; break;
            case "Ascended Servant": this.amountEssence = this.bless.getEssenceBless() + 100; break;
            case "Servant": this.amountEssence = 250; break;
            case "Essence Experiment": this.amountEssence = 200; break;
            case "Mortal": this.amountEssence = 100; break;
            case "Free Essence": this.amountEssence = 99; break;
        }
    }

    public int getAmountEssence() {
        return amountEssence;
    }

    public String getEssenceType() {
        return type;
    }

    public String getEssenceTypetoString() {
        return "Essence Type {" + getEssenceType() + ", Amount of Essence: " + getAmountEssence() + "}" ;
    }
}
