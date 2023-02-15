public class Mechanic {

    private String firstName;
    private String lastName;
    private String company;
    private String identifier;


    public Mechanic(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.identifier = firstName + " " + lastName + " from " + company;
    }

    public void carryOutMaintenance() {
        System.out.println(firstName + " " + lastName + " from " + company + " is carrying out maintenance.");
    }

    public void fixCar() {
        System.out.println(firstName + " " + lastName + " from " + company + " is fixing the car.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }
    public String getIdentifier() {
        return identifier;
    }
}

