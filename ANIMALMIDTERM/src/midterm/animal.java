package midterm;

import java.util.Scanner;

class Dog {
    private String dogname;
    private String breed;


    public Dog(String name, String breed) {
        this.dogname = name;
        this.breed = breed;
    }


    public void setName(String name) {
        this.dogname = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void displayDog() {
        System.out.println("Dog Name: " + dogname + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" name of the first dog: ");
        String name1 = scanner.nextLine();
        System.out.print(" breed of the first dog: ");
        String breed1 = scanner.nextLine();

        System.out.print(" name of the second dog: ");
        String name2 = scanner.nextLine();
        System.out.print(" breed of the second dog: ");
        String breed2 = scanner.nextLine();

        Dog d1 = new Dog(name1, breed1);
        Dog d2 = new Dog(name2, breed2);

        System.out.println("\nBefore:");
        d1.displayDog();
        d2.displayDog();

        System.out.print("\n new name for the first dog: ");
        d1.setName(scanner.nextLine());
        System.out.print("Enter the new breed for the first dog: ");
        d1.setBreed(scanner.nextLine());

        System.out.print(" new name for the second dog: ");
        d2.setName(scanner.nextLine());
        System.out.print(" new breed for the second dog: ");
        d2.setBreed(scanner.nextLine());


        System.out.println("\nAfter:");
        d1.displayDog();
        d2.displayDog();

        scanner.close();
    }
}
