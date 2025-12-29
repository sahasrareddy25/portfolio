
/*public class loop{
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
}

public class loop{
    public static void main(String[] args) {
        String firstName = "Sahasra";
        String lastName = "Reddy";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
    }
}


//all tables
public class Main {
    public static void main(String[] args) {

        // Outer loop → for tables (1 to 10)
        for (int i = 1; i <= 10; i++) {

            System.out.println("Table of " + i);

            // Inner loop → for multiplication (1 to 10)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); 
        }
    }
}
*/

//print 1 to 100 even numbers tables up to 10
public class Main {
    public static void main(String[] args) {

        // Outer loop: Even numbers from 2 to 100
        for (int i = 2; i <= 100; i += 2) {

            System.out.println("Table of " + i);

            // Inner loop: Multiplication from 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Blank line between tables
        }
    }
}

