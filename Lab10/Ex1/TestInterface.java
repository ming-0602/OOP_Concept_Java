package Ex1;

import java.util.GregorianCalendar;

public class TestInterface {
    public static void main(String args[]) {
        System.out.println("Testing the UnderGraduate no-arg constructor: ");
        UnderGraduate u1 = new UnderGraduate();
        System.out.println(u1);

        System.out.println("\n\nTesting the UnderGraduate multi-arg constructor: ");
        UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new
                GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);
        System.out.println(u2);

        System.out.println("\n\nTesting the PostGraduate no-arg constructor: ");
        PostGraduate p1 = new PostGraduate();
        System.out.println(p1);

        System.out.println("\n\nTesting the PostGraduate multi-arg constructor: ");
        PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new
                GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");
        System.out.println(p2);

        System.out.println("\n\nTesting is PermanentLecturer multi-arg constructor");
        String[] tem = {"Economics", "Media Presentation", "Political Debate"};
        PermanentLecturer pl = new PermanentLecturer("Thomas Aquinas", "Dublin", new GregorianCalendar(1984,12,31) , "52673", tem, new GregorianCalendar(2003, 06, 23), "Lots and lots of Pension Entitlement", "Full time professional");
        System.out.println(pl);

        System.out.println("\n\nTesting the TemporaryLecturer multi-arg constructor");
        String[] tem2 = {"Fractal Geometry", "Tensors"};
        TemporaryLecturer tp = new TemporaryLecturer("Mary McKenzie", "Bundoran, Donegal", new GregorianCalendar(1971,06,13), "647382", tem2, new GregorianCalendar(2016, 03, 8), 3);
        System.out.println(tp);
    }
}

