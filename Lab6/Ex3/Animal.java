package Ex3;

import java.util.Arrays;

public class Animal {

    //true encapsulation ensured as all 4 attributes are private

    private String type;
    private String continents[]; //a nested object within the Animal class
    private double weight;
    private int age;

    //the no-arg constructor indirectly accessing the 4 attributes via 4-arg constructor

    public Animal() {
        this("No type specified",null,0.0,0);
    }

    //the 4-arg constructor indirectly accessing the 4 attributes via mutators
    public Animal(String type, String continents[], double weight, int age) {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }


    //the 4 accessor methods

    public String getType() {
        return type;
    }

    public String[] getContinents() {
        //return continents;
        return Arrays.copyOf(continents,continents.length);
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    //the 4 mutator methods

    public void setType (String type) {
        this.type = type;
    }

    public void setContinents (String continents[]) {
        //this.continents=continents; //potential breaking of encapsulation
        //Own version of copy array
        if(continents!=null){
            String[] newarray = new String[continents.length];
            for (int i = 0; i < continents.length; i++) {
                newarray[i] = continents[i];
            }
            this.continents = newarray;
        }
//            this.continents = Arrays.copyOf(continents,continents.length);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //displaying the state of the objects attributes indirectly via the accessors

    public String toString() {
        String str = "Animal Type: " + getType() + "\nAnimal Weight: " + getWeight() +
                "\nAnimal Age: " + getAge() + "\nAnimal Continents: ";

        if(continents==null) //i.e. no array object exists=>no continents either
        {
            str+="No continents specified";
            return str;
        }

      /*if we get to here then there must have been an array object created
      so traverse it using a loop and "join" its contents to the existing string object*/

        for(int i=0;i< getContinents().length;i++)
            str+=continents[i] + " ";
        return str;
    }
}

