// While loops

// Open your IDE and create a new Java class named Table
// Copy the following code into your Java class Table and verify it works


import java.util.Scanner;

public class Whileloop{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any Number: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

        
        int i = 1;
        while (i <= 10) {
            int result = num * i;
            System.out.printf("%d x %d = %d\n", num, i, result);
            i++;
        }
    }
}