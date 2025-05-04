import java.util.Scanner; //importing Scanner package

public class Main {
    public static void main(String[] args) {
        //creating an object for Scanner class
        Scanner scanner = new Scanner(System.in);

        //Ask user to enter name
        System.out.println("Please enter your name: ");

        String name = scanner.nextLine();

        //Ask user to enter age
        System.out.println("Please enter your age: ");

        int age = scanner.nextInt();

        //show user's input as output
        System.out.println("Your name is \t" + name);
        System.out.println("Your age is \t" + age);

        //to take boolean input
        boolean isActive = scanner.nextBoolean();

        //to take byte input
        byte data = scanner.nextByte();

        //to take double input
        double salary = scanner.nextDouble();

        //to take float input
        float floatNumber = scanner.nextFloat();

        //to take long input
        long longNumber = scanner.nextLong();

        //to take short input
        short shortNumber = scanner.nextShort();

        scanner.close();


    }
}