package Java;

import java.time.LocalDate;

class Person {
    public String name;
    public char gender;
    public LocalDate dob;
    public static boolean isHuman = true;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;

    }

    public Person(String name, char gender, LocalDate dob) {
        this(name, gender);
        this.dob = dob;
    }
}

public class ClassandObject {
    public static void main(String[] args) {
        Person p1 = new Person("Joshua", 'M');
        Person p2 = new Person("Bella", 'F');
        Person p3 = new Person("Pam", 'F');
/*
        p1.name = "Josh";
        p1.name = "Joshua";
        p2.name = "Bella";
        p3.name = "Pam";
*/

/*
        p1.gender = 'M';
        p2.gender = 'F';
        p3.gender = 'F';
*/
        p1.dob = LocalDate.of(1990, 5, 8);
        p2.dob = LocalDate.of(2000, 5, 4);
        p3.dob = LocalDate.of(1994, 12, 30);

    }

}
