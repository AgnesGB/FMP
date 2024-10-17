public class Race {
    private String race; //Elfo, Halfling, Marphyja, Satiro, Menuli, Hydralith, Humano, Yvaris.
    private boolean isMagic;
    private String raceType; //focused on magic or not
    private String raceEffects; //effects in general
    private String raceDescription;
    private int raceHP; //default HP
    private int raceMP; //default MP
    private boolean canSetRace;

    public Race() {
        this.race = "World's Creature";
        this.raceEffects = "None and All";
        this.raceType = "Magical Type";
        this.isMagic = true;
        this.raceDescription = "Created for The World Aethesdha";
        this.raceHP = 0;
        this.raceMP = 0;
    }

    public void setRace(String race) {
        this.race = race;

        switch (race) {
        case "Marphyja" :
            this.raceEffects = "Voo, Fadiga, Spell Power (0.85), Attack Dmg(3), Cooldown (0.9), Atk Speed (3.9), Armor (0), Crit Hit (20%), Crit DMG(1.5).";
            this.raceType = "Magical Type";
            this.isMagic = true;
            this.raceDescription = "Pombo";
            this.raceHP = 20;
            this.raceMP = 150;
            break;
        case  "Satiro":
            this.raceEffects = "Jump Boost, Spell Power (0.85), Attack Dmg(1), Cooldown (0.9), Speed (0.120), Armor (2), Parry(30%), Crit DMG(0.7). ";
            this.raceType = "Non Magical Type";
            this.isMagic = false;
            this.raceDescription = "Bode";
            this.raceHP = 36;
            this.raceMP = 100;
            break;
            case "Elfo":
            this.raceEffects = "Visão Noturna, Spell Power (1.03), Attack Dmg(1), Cooldown (1.1), Atk Speed (3.8), Atk Range (2), Armor (0), Penetration (0.5).";
            this.raceType = "Magical Type";
            this.isMagic = true;
            this.raceDescription = "Orelhudo";
            this.raceHP = 24;
            this.raceMP = 250;
            break;
        case  "Halfling":
            this.raceEffects = "Sorte, Spell Power (0.85), Attack Dmg(1), Reach Dist (3), Atk Range (2), Atk Speed (4.6), Speed (0.124), Dodge (0.05), Crit Hit(10%), Crit DMG (1.5).";
            this.raceType = "Non Magical Type";
            this.isMagic = false;
            this.raceDescription = "Meio Humano (literalmente)";
            this.raceHP = 24;
            this.raceMP = 100;
            break;
        case  "Hydralith":
            this.raceEffects = "Conduit, Swin (2), Spell Power (0.85), Attack Dmg(5), Cooldown (0.9), Atk Speed (4.4), Speed (0.092), Armor (2), Speed (0.092), Crit DMG(50% de dano 0.8).";
            this.raceType = "Magical Type";
            this.isMagic = false;
            this.raceDescription = "Peixe";
            this.raceHP = 36;
            this.raceMP = 100;
            break;
        case  "Menuli":
            this.raceEffects = "Water Breathing, Spell Power (1.02), Attack Dmg(1), Cooldown (1.1), Spell Resist (1.02), Atk Speed (3.8), Speed (0.090), Armor (2), Crit Hit (50%), Crit DMG(0.7), Healing Power (2).";
            this.raceType = "Magical Type";
            this.isMagic = true;
            this.raceDescription = "Calango Chifrudo";
            this.raceHP = 46;
            this.raceMP = 200;
            break;
        case "Mini Menuli":
            this.raceEffects = "Water Breathing, Spell Power (1.02), Attack Dmg(1), Cooldown (1.1), Spell Resist (1.02), Atk Speed (3.8), Speed (0.090), Armor (2), Crit Hit (50%), Crit DMG(0.7), Healing Power (2).";
            this.raceType = "Magical Type";
            this.isMagic = true;
            this.raceDescription = "Calango Chifrudo";
            this.raceHP = 46;
            this.raceMP = 200;
            break;
        case  "Humano":
            this.raceEffects = "Attack Dmg(2), Cooldown (1.1), Atk Speed (4.2), Crit DMG (10% de dano 0.8).";
            this.raceType = "Non Magical Type";
            this.isMagic = false;
            this.raceDescription = "Basic as Fuck";
            this.raceHP = 30;
            this.raceMP = 100;break;
        case "Yvaris":
            this.raceEffects = "Spell Power (1.02), Attack Dmg(2), Cooldown (1.1), Atk Speed (4.2), Speed (0.108), Dodge (10%), Crit DMG (20% de dano 0.8).";
            this.raceType = "Magical Type";
            this.isMagic = true;
            this.raceDescription = "Furry";
            this.raceHP = 28;
            this.raceMP = 150;
            break;
        }
    }

    public String getRace(){
        return race;
    }

    public String getRaceType() {
        return raceType;
    }

    public String getRaceDescription() {
        return raceDescription;
    }

    public String getRaceEffects() {
        return raceEffects;
    }

    public int getRaceHP() {
        return raceHP;
    }

    public int getRaceMP() {
        return raceMP;
    }

    @Override
    public String toString() {
        return "Race{" +
                " Race='" + race + '\'' +
                ", Is Magic=" + isMagic +
                ", Race Type='" + raceType + '\'' +
                ", Race Effects='" + raceEffects + '\'' +
                ", Race Description='" + raceDescription + '\'' +
                ", Race HP=" + raceHP +
                ", Race MP=" + raceMP +
                '}';
    }
}
