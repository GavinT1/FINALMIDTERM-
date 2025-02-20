package midterm;

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
     
        Dog d1 = new Dog("Bea", "Chuwawa");
        Dog d2 = new Dog("Jucky", "husky");

 
        System.out.println("Before:");
        d1.displayDog();
        d2.displayDog();

  
        d1.setName("Rocky");
        d1.setBreed("bulldog");
        d2.setName("Gavin");
        d2.setBreed("Dachshund");

    
        System.out.println("\nAfter:");
        d1.displayDog();
        d2.displayDog();
    }
}
