import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        String name;
        int age;
        int dob;
        Scanner keybd = new Scanner(System.in);
        System.out.print("Input your name: ");
        name = keybd.nextLine();
        System.out.print("Please enter your age: ");
        age = keybd.nextInt();
        System.out.print("Please enter your birth year: ");
        dob= keybd.nextInt();
        System.out.println("Summary:\nYour name is: " + name);
        System.out.println("\nYour age is " + age);
        System.out.println("\nYour birth year is: " +dob);


    }
}
