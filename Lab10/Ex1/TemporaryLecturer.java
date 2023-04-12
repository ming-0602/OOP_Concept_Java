package Ex1;

import java.util.Date;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;

    public TemporaryLecturer(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public TemporaryLecturer(String name, String address, GregorianCalendar dateofBirth, String staffID, String[] courseTaught, GregorianCalendar dateofAppointment, int hoursWorked) {
        super(name, address, dateofBirth, staffID, courseTaught, dateofAppointment);
        this.hoursWorked = hoursWorked;
    }

    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
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

    public int getHoursWorked() {
        return hoursWorked;
    }


    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        String str = "";
        return super.toString() + getStatus() + "\n" +
                "Lecturer Point on Scale is 3" + getPointOnScale() + "\n"+
                "Lecture Hours Worked " + getHoursWorked();
    }
}
