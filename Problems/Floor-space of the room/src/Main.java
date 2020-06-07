import java.util.Scanner;

class Main {
    public static double getTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double getRectangleArea(double a, double b) {
        return a * b;
    }

    public static double getCircleArea(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        switch (userInput) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(getTriangleArea(a, b, c));
                break;
            case "rectangle":
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                System.out.println(getRectangleArea(length, breadth));
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(getCircleArea(r));
                break;
            default:
                break;
        }
    }
}