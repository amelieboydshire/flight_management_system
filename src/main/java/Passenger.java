public class Passenger {

    private String name;
    private int contactNumber;
    private int passengerId;

    public Passenger(String name, int contactNumber, int passengerId) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
}
