import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

public class AreaCalculatorr{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter input (e.g., rectangle 10 5 circle 2 square 4):");
        String[] tokens = br.readLine().toLowerCase().split("\\s+");

        for (int i = 0; i < tokens.length; ) {
            String shape = tokens[i];

            if (shape=="rectangle") {
                    double length = Double.parseDouble(tokens[i + 1]);
                    double breadth = Double.parseDouble(tokens[i + 2]);
                    Rectangle rectangle = new Rectangle(length, breadth);
                    System.out.printf("Area of Rectangle: %.2f%n", rectangle.getArea());
                    i += 3;
                    }

                else if(shape=="circle"){
                    double radius = Double.parseDouble(tokens[i + 1]);
                    Circle circle = new Circle(radius);
                    System.out.printf("Area of Circle: %.2f%n", circle.getArea());
                    i += 2;
                    }

                else if(shape=="square"){
                    double side = Double.parseDouble(tokens[i + 1]);
                    Square square = new Square(side);
                    System.out.printf("Area of Square: %.2f%n", square.getArea());
                    i += 2;
                    }

               else{
                    System.out.println("Invalid shape: " + shape);
                    i++; // Skip unknown token
}
}
            }
        }
