import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPartsCount = scanner.nextInt();
        int fixedPartsCount = 0;
        int rejectedPartsCount = 0;
        int perfectPartsCount = 0;
        for (int i = 0; i < totalPartsCount; ++i) {
            int currentPart = scanner.nextInt();
            if (currentPart == 1) {
                ++fixedPartsCount;
            } else if (currentPart == -1) {
                ++rejectedPartsCount;
            } else {
                ++perfectPartsCount;
            }
        }
        System.out.println(perfectPartsCount + " " + fixedPartsCount + " " + rejectedPartsCount);
    }
}