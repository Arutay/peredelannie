import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> transportQueue;
    public ServiceStation() {
        this.transportQueue = new LinkedList<Transport>();
    }
    public void addTransport(Transport transport) {
        if (!(transport.getDriverName().startsWith("Bob"))) {
            transportQueue.offer(transport);
        }
    }
    public void carryOutTechnicalInspection() {
        Transport transport = transportQueue.poll();
        if (transport != null) {
            System.out.println("Carrying out technical inspection for transport with driver: " + transport.getDriverName());
        } else {
            System.out.println("No transports in queue for technical inspection");
        }
    }
}
