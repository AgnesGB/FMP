import java.util.ArrayList;

public class God {
    private boolean hasCore;
    private boolean canCreateServant;
    private boolean canBePatronGod;
    private boolean hasPatronGod;
    private final ArrayList<Essence> servants = new ArrayList<>();


    public ArrayList<Essence> getServos() {
        return servants;
    }

    public void addServos(Essence servant) {
        this.servants.add(servant);
    }

}
