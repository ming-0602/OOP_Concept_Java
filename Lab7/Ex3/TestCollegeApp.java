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

//        System.out.println(Arrays.toString(stdarrycom));

        Department dp = new Department(std1.getDepartment(), stdarrymedia);
        System.out.println(dp);

        for (int i = 0; i < stdarrycom.length; i++) {
            if (stdarrycom[i]!=null){
                System.out.println(stdarrycom[i]);
            }
        }

        System.out.println("\n");

        Department dp2 = new Department(std.getDepartment(), stdarrycom);
        System.out.println(dp2);

        for (int i = 0; i < stdarrymedia.length; i++) {
            if (stdarrymedia[i]!=null){
                System.out.println(stdarrymedia[i]);
            }
        }




    }
}
