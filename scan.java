 import java.util.Scanner;


public class Main {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    double gpa;
    System.out.print("Enter your name: ");
    name = scanner.nextLine(); //This can detect spaces
    System.out.println("Hello " + name);
    System.out.print("Enter your name no spaces allowed: ");
    name = scanner.next(); //this ends at spaces
    System.out.println("Hello " + name);
    System.out.print("Enter your age: ");
    age = scanner.nextInt(); 
    System.out.println("Your age is: " + age);
    System.out.println("What is your GPA");
    gpa = scanner.nextDouble();   
    scanner.close();
   }
 }
