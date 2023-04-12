package Ex1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person{
    private String name;
    private String address;
    private GregorianCalendar dateofBirth;
    private String staffID;
    private String[] courseTaught;
    private GregorianCalendar dateofAppointment;

    public Lecturer() {
       this("Undefined", "Undefined", null, "Undefined", null , null);
    }


    public Lecturer(String name, String address, GregorianCalendar dateofBirth, String staffID, String[] courseTaught, GregorianCalendar dateofAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateofBirth);
        setStaffID(staffID);
        setCourseTaught(courseTaught);
        setDateofAppointment(dateofAppointment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateofBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String[] courseTaught) {
        this.courseTaught = courseTaught;
    }

    public GregorianCalendar getDateofAppointment() {
        return dateofAppointment;
    }

    public void setDateofAppointment(GregorianCalendar dateofAppointment) {
        this.dateofAppointment = dateofAppointment;
    }

    public abstract String getStatus();

    public abstract int getPointOnScale();

    @Override
    public String toString() {
        String str = "";
        str += "Lecture name is " + getName() + "\n" +
                "Lecture address is " + getAddress() + "\n" +
                "Lecture date of birth is ";

        for (int i = 0; i < getCourseTaught().length; i++) {
            str += getCourseTaught()[i] + " , ";
        }

        if(getDateOfBirth()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class

            Date dob = getDateOfBirth().getTime();

            //Need to use get the date of birth out on screen in a particular
            //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
            //java.text does the job. Interestingly, "MM" has to be in capitals
            //or else you would be displaying milliseconds rather than month

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDob = formatDate.format(dob);
            str+=strDob;

        }

        str += "\n" + "Lecture ID is " + getStaffID() +
                "\n" + "Lecture Course taught is ";

//        str += "\nLecture Date of Appointment is " + getDateofAppointment();

        return str;

    }
}
