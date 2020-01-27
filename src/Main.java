public class Main {
    public static void main(String[] args) {
        // using escape sequences to print a box
        System.out.println("********");
        System.out.println("*" + "\t" + "   " + "*");
        System.out.println("*" + "\t" + "   " + "*");
        System.out.println("*" + "\t" + "   " + "*");
        System.out.println("*" + "\t" + "   " + "*");
        System.out.println("********");

        // using loops
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 7; j++) {
                if ((i >= 1 && i <= 4) && (j >= 1 && j < 7)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
