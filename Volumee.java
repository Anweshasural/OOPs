public class Volumee {

    // Method to calculate volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Method to calculate volume of Cylinder
    double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate volume of Ellipsoid
    double calculateVolume(double a, double b, double c) {
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }

    public static void main(String[] args) {
        // Check if sufficient arguments are passed
        if (args.length < 6) {
            System.out.println("Usage: java Volume <cube_side> <cyl_radius> <cyl_height> <ellipsoid_a> <ellipsoid_b> <ellipsoid_c>");
            return;
        }

        // Parse the command line arguments
        double cubeSide = Double.parseDouble(args[0]);
        double cylRadius = Double.parseDouble(args[1]);
        double cylHeight = Double.parseDouble(args[2]);
        double ellipsoidA = Double.parseDouble(args[3]);
        double ellipsoidB = Double.parseDouble(args[4]);
        double ellipsoidC = Double.parseDouble(args[5]);

        Volume v = new Volume();

        // Calculate volumes
        double cubeVolume = v.calculateVolume(cubeSide);
        double cylinderVolume = v.calculateVolume(cylRadius, cylHeight);
        double ellipsoidVolume = v.calculateVolume(ellipsoidA, ellipsoidB, ellipsoidC);

        // Print results
        System.out.printf("Volume of Cube = %.2f\n", cubeVolume);
        System.out.printf("Volume of Cylinder = %.2f\n", cylinderVolume);
        System.out.printf("Volume of Ellipsoid = %.2f\n", ellipsoidVolume);
    }
}
