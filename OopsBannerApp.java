/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 2 by improving
 * the way the "OOPS" banner is constructed and displayed.
 * It uses String.join() for better readability and efficiency.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Row 1
        System.out.println(String.join(" ",
                "OOOO",   "OOOO",   "PPPP",   "SSSS"));

        // Row 2
        System.out.println(String.join(" ",
                "O  O",   "O  O",   "P   P",  "S"));

        // Row 3
        System.out.println(String.join(" ",
                "O  O",   "O  O",   "PPPP",   "SSSS"));

        // Row 4
        System.out.println(String.join(" ",
                "O  O",   "O  O",   "P",      "   S"));

        // Row 5
        System.out.println(String.join(" ",
                "OOOO",   "OOOO",   "P",      "SSSS"));
    }
}
