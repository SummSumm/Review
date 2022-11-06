package Java;


class Employee {
    private String name;
    private double salary;
    private int ID;


    // without encapsulation we could give a blank name or numbers for example.
    //with setters we can give condition


    public String getName() {
        if (name==null) {
            throw new RuntimeException("Employee name cannot be null");
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("Employee name cannot be empty or blank");
        }

        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new RuntimeException("Employee name cannot contain digits");
            }
            if (!(Character.isLetter(c))) {
                if (c != ' ') {
                    throw new RuntimeException("Employee name cannot have special characters");
                }
            }
        }

        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("Ayla Nur");
        System.out.println(employee1.getName().toUpperCase() + " is a valid employee name");


    }
}
