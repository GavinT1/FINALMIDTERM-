package midterm;

import java.util.Scanner;

public class Area {
   
    private double width;
    private double height;

  
    public Area(double width, double height) {
        this.width = width;
        this.height = height;
    }

 
    public double calculateArea() {
        return width * height;
    }


    public double calculatePerimeter() {
        return 2 * (width + height);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("height of the rectangle: ");
        double height = scanner.nextDouble();

     
        Area myRectangle = new Area(width, height);

        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + myRectangle.calculatePerimeter());

        scanner.close();
    }
}
