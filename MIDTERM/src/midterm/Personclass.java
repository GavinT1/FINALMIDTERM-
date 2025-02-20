package midterm;

import java.util.Scanner;

public class Personclass {

    private String name;
    private int age;
    private String address;

 
    public Personclass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

 
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personclass[] people = new Personclass[5]; 

    
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Address: ");
            String address = scanner.nextLine();

    
            people[i] = new Personclass(name, age, address);
        }


        System.out.println("\nAll Inputs:");
        for (Personclass person : people) {
            person.displayInfo();
        }

        scanner.close();
    }
}

