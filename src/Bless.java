public class Bless {
    private Servant id;
    private EssenceType essenceType;
    private God patronGod;
    private int essenceBless;

    public Bless(EssenceType essenceType) {
        this.essenceType = essenceType;
    }

    public God getPatronGod() {
        return patronGod;
    }

    public void setEssenceBless(int essenceBless) {
        this.essenceBless = essenceBless;
    }

    public int getEssenceBless() {
        return essenceBless;
    }

    public void increaseEssenceBless(int increase) {
        this.essenceBless = essenceBless+increase;
    }

    public Servant getId() {
        return id;
    }

    public boolean isServant() {
        if (this.essenceType.getEssenceType() == "Servant") {
            this.essenceBless = 200+essenceBless;
            return true;
        } else {
            return false;
        }
    }
}
