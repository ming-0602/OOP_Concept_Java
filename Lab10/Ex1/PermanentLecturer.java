package Ex1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer{
    private String pensionEntitlements;
    private String status;

//    public PermanentLecturer(String pensionEntitlements, String status) {
//        setPensionEntitlements("none");
//        setStatus("wot");
//    }

    public PermanentLecturer(String name, String address, GregorianCalendar dateofBirth, String staffID,
                             String[] courseTaught, GregorianCalendar dateofAppointment, String pensionEntitlements, String status) {
        super(name, address, dateofBirth, staffID, courseTaught, dateofAppointment);
        this.pensionEntitlements = pensionEntitlements;
        this.status = status;
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPointOnScale(){
        Date dm = getDateofAppointment().getTime();
        Date now = GregorianCalendar.getInstance().getTime();

        int yearWork = (int)Math.floor(now.getYear() - dm.getYear());
        if(yearWork > 20){
            return 20;
        }else {
            return yearWork;
        }
    }
    @Override
    public String toString() {
        String str = "";
        if(getDateofAppointment()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class

            Date dob = getDateofAppointment().getTime();

            //Need to use get the date of birth out on screen in a particular
            //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
            //java.text does the job. Interestingly, "MM" has to be in capitals
            //or else you would be displaying milliseconds rather than month

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDob = formatDate.format(dob);
            str+=strDob;

        }
        return super.toString() + "\n" +
                "Lecture Date of Appointment is " + str + "\n" +
                "Lecture status is " + getStatus() + "\n" +
                "Lecture Point on Scale is " + getPensionEntitlements() + "\n" ;
    }
}
