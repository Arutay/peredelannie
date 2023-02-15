import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Transport car1 = new Transport("John Doe");
        Set<Mechanic> car1Mechanics = new HashSet<Mechanic>();
        car1Mechanics.add(new Mechanic("Jane", "Doe", "ABC Mechanics"));
        car1Mechanics.add(new Mechanic("John", "Smith", "XYZ Mechanics"));
        transportMechanicsMap.put(car1, car1Mechanics);
        serviceStation.addTransport(car1);

        Transport truck1 = new Transport("Jane Smith");
        Set<Mechanic> truck1Mechanics = new HashSet<Mechanic>();
        truck1Mechanics.add(new Mechanic("Tom", "Brown", "DEF Mechanics"));
        truck1Mechanics.add(new Mechanic("Sarah", "Johnson", "GHI Mechanics"));
        transportMechanicsMap.put(truck1, truck1Mechanics);
        serviceStation.addTransport(truck1);

        Transport bus1 = new Transport("Bob Johnson");
        Set<Mechanic> bus1Mechanics = new HashSet<Mechanic>();
        bus1Mechanics.add(new Mechanic("Emily", "Davis", "JKL Mechanics"));
        bus1Mechanics.add(new Mechanic("Michael", "Anderson", "MNO Mechanics"));
        transportMechanicsMap.put(bus1, bus1Mechanics);
        serviceStation.addTransport(bus1);

        for (Map.Entry<Transport, Set<Mechanic>> entry : transportMechanicsMap.entrySet()) {
            System.out.println("Driver name: " + entry.getKey().getDriverName());
            System.out.println("Mechanics: ");
            for (Mechanic mechanic : entry.getValue()) {
                System.out.println(mechanic.getIdentifier());
            }
        }
        serviceStation.carryOutTechnicalInspection();
        serviceStation.carryOutTechnicalInspection();
        serviceStation.carryOutTechnicalInspection();
        serviceStation.carryOutTechnicalInspection();
    }
}