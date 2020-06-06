import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        firstLine = firstLine.replace(" ", "");
        secondLine = secondLine.replace(" ", "");
        System.out.println(firstLine.equals(secondLine));
    }
}
