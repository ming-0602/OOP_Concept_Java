package Ex3;

import java.util.Arrays;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student std = new Student(154345, "Jake", "Computing");
        Student std1 = new Student(234532, "Mary", "Creative Media");
        Student std2 = new Student(453726, "Tommy", "Computing");
        Student std3 = new Student(623456, "Peter", "Creative Media");

        Student[] stdarrycom = new Student[10];
        stdarrycom[0] = std;
        stdarrycom[1] = std2;

        Student[] stdarrymedia = new Student[10];
        stdarrymedia[0] = std1;
        stdarrymedia[1] = std3;
        
        Department computing = new Department("Computing", stdarrycom);
        Department creativemedia = new Department("Creative Media" , stdarrymedia);

        Department[] department = new Department[5];
        department[0] = computing;
        department[1] = creativemedia;

        Institute inst = new Institute("Insitute of Technology, Tralee", department);
        System.out.println(inst);


        Student[] students;
        int index = 0;
        for (int i = 0; i < department.length; i++) {
            if (department[i] != null){
                students = department[i].getStudents();
                for (int j = 0; j < students.length; j++) {
                    if (students[j] != null){
                        index++;
                    }
                }
            }
        }

        System.out.println("Total student in insitute: " + index);

    }
}
