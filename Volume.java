import java.io.*;

class Volume {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Cylinder
    double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Volume of Ellipsoid
    double calculateVolume(double a, double b, double c) {
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }

    public static void main(String[] args) throws IOException {
        Volume v = new Volume();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter side of the Cube:");
        double side = Double.parseDouble(br.readLine());
        System.out.println("Volume of Cube = " + v.calculateVolume(side));

        System.out.println("Enter radius and height of the Cylinder:");
        double radius = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        System.out.println("Volume of Cylinder = " + v.calculateVolume(radius, height));

        System.out.println("Enter a, b, c of the Ellipsoid:");
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());
        System.out.println("Volume of Ellipsoid = " + v.calculateVolume(a, b, c));
    }
}
