import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        Scanner keybd = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = keybd.nextLine();
        System.out.print("Please enter your age: ");
        int age = keybd.nextInt();
        System.out.print("Please enter your birth year: ");
        int dob= keybd.nextInt();
        System.out.println("Summary:\nYour name is: " + name);
        System.out.println("\nYour age is " + age);
        System.out.println("\nYour birth year is: " +dob);


    }
}
