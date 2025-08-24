class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getPerimeter() {
        return 4 * side;
    }
}

public class Perimeter_Calculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input like: rectangle 10 5 circle 2 square 4");
            return;
        }

        for (int i = 0; i < args.length; ) {
            String shape = args[i].toLowerCase();

            if (shape.equals("rectangle")) {
                double length = Double.parseDouble(args[i + 1]);
                double breadth = Double.parseDouble(args[i + 2]);
                Rectangle rect = new Rectangle(length, breadth);
                System.out.printf("Perimeter of Rectangle: %.2f%n", rect.getPerimeter());
                i += 3;
            }
            else if (shape.equals("circle")) {
                double radius = Double.parseDouble(args[i + 1]);
                Circle circ = new Circle(radius);
                System.out.printf("Perimeter of Circle: %.2f%n", circ.getPerimeter());
                i += 2;
            }
            else if (shape.equals("square")) {
                double side = Double.parseDouble(args[i + 1]);
                Square sq = new Square(side);
                System.out.printf("Perimeter of Square: %.2f%n", sq.getPerimeter());
                i += 2;
            }
            else {
                System.out.println("Invalid shape: " + shape);
                i++; // move to next argument
            }
        }
    }
}
