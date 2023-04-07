package Ex3;

import java.util.Arrays;

public class Institute {

    private String name;
    private Department Department[];


    @Override
    public String toString() {
        String output = "";
        output += "Name: " + getName() +"\n\n";
        for (int i = 0; i < getDepartment().length; i++) {
            if (Department[i]!=null){
                output += Department[i];
//                output += "\n";
            }
//            output += "\n";
        }
        return output;
    }

    public Institute(String name, Department[] department) {
        setName(name);
        setDepartment(department);
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
