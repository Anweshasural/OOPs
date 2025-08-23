public class DesignPattern {

    // Method to draw a triangle
    public static void drawTriangle(int height) {
        System.out.println("Triangle:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to draw a square
    public static void drawSquare(int size) {
        System.out.println("Square:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to draw a rectangle
    public static void drawRectangle(int rows, int cols) {
        System.out.println("Rectangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Main method to demonstrate patterns
    public static void main(String[] args) {
        // Demonstration
        drawTriangle(5);
        System.out.println();
        drawSquare(4);
        System.out.println();
        drawRectangle(3, 6);
    }
}