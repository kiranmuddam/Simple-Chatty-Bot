import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputArmy = scanner.nextInt();
        if (inputArmy < 1) {
            System.out.println("no army");
        } else if (inputArmy >= 1 && inputArmy <= 19) {
            System.out.println("pack");
        } else if (inputArmy >= 20 && inputArmy <= 249) {
            System.out.println("throng");
        } else if (inputArmy >= 250 && inputArmy <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}