public abstract class Essence {
    boolean isMortal;
    boolean canBeTransformed;
    boolean isConscious;
    boolean hasAttributes;
    Attributes attributes;
    boolean hasFeatures;
    Features features;
    boolean hasRace;
    Race race;

    public Essence(boolean isMortal, boolean canBeTransformed, boolean isConscious, boolean hasAttributes, boolean hasFeatures, boolean hasRace) {
        this.isMortal = isMortal;
        this.canBeTransformed = canBeTransformed;
        this.isConscious = isConscious;
        this.hasAttributes = hasAttributes;
        this.hasFeatures = hasFeatures;
        this.hasRace = hasRace;

        if (this.hasAttributes) {
            attributes = new Attributes();
        }
        if (this.hasFeatures) {
            features = new Features();
        }
        if (this.hasRace) {
            race = new Race();
        }
    }
}
