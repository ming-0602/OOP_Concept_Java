package Ex1;

public class Person {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return  "First Name = " + firstname +  " " +
                "Last Name = " + lastname + ' ' ;
    }

    public Person(){
        this.firstname = "Not Supplied";
        this.lastname = "Not Supplied";

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
