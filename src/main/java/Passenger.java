public class Passenger {

    private String name;
    private String contactNumber;
    private int passengerId;

    public Passenger(String name, String contactNumber, int passengerId) {
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
}
