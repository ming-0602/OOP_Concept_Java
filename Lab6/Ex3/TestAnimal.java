package Ex3;

import Sample1.Animal;

public class TestAnimal {
    public static void main(String args[]) {
        System.out.println("testing the no-argument constructor....");
        Sample1.Animal animal1 = new Sample1.Animal(); //tests no-arg constructor
        System.out.println(animal1); //tests toString() and the accessor methods
        String lionContinents[] = {"Africa", "Asia"}; //initialise an array of strings

        //tests 4-arg constructor and the 4 mutator methods
        System.out.println("\n\n\ntesting the 4-argument constructor....");
        animal1 = new Animal("Lion", lionContinents, 200, 40);
        System.out.println(animal1);

        lionContinents[0] = "Europe"; // not working because it is not suppose to code like this and it is unable to change the thingy
        System.out.println("\n" + animal1);

    }
}
