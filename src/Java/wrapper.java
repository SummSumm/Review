package Java;

public class wrapper {
    public static void main(String[] args) {

        Integer a = 100;
        Double b = 2.5;
        Character c = 'C';
        Boolean d = true;

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        //parse and valueOf are used a lot
        // to convert String

        String string = "12345";
        int n1 = Integer.parseInt(string);
        Integer n2 = Integer.valueOf(string);
    }
}
