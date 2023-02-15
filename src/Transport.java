import java.util.ArrayList;
import java.util.List;

public class Transport {
    private String driverName;
    private List<Mechanic> mechanics;

    public Transport(String driverName) {
        this.driverName = driverName;
        this.mechanics = new ArrayList<Mechanic>();
    }

    public void addMechanic(Mechanic mechanic) {
        if (!mechanics.contains(mechanic)) {
            mechanics.add(mechanic);
        }
    }

    public String getDriverName() {
        return driverName;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

}
