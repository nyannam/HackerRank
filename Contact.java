public class Contact {
    private String name;
    private String phNo;

    public Contact(String name, String phNo) {
        this.name = name;
        this.phNo = phNo;
    }

    public String getName() {
        return name;
    }

    public String getPhNo() {
        return phNo;
    }

    public static Contact createContact(String name, String phNo) {
        return new Contact(name,phNo);
    }
}
