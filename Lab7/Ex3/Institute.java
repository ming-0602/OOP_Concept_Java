package Ex3;

import java.util.Arrays;

public class Institute {

    private String name;
    private Department Department[];


    @Override
    public String toString() {
        return "\nName: " + getName() + "," + getDepartment();
    }

    public Institute(String name, Department[] department) {
        this.name = name;
        Department = department;
    }

    public Institute(String name, String[] department) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartment() {
        return Department;
    }

    public void setDepartment(Department[] department) {
        Department = department;
    }


}
