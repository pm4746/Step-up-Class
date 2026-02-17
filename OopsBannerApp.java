/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by storing banner lines in a
 * String array and printing them using a for-each loop,
 * improving modularity and reusability.
 *
 * @author Developer
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define array to store banner lines
        String[] lines = new String[5];

        // Populate banner using String.join()
        lines[0] = String.join(" ",
                "OOOO",   "OOOO",   "PPPP",   "SSSS");

        lines[1] = String.join(" ",
                "O  O",   "O  O",   "P   P",  "S");

        lines[2] = String.join(" ",
                "O  O",   "O  O",   "PPPP",   "SSSS");

        lines[3] = String.join(" ",
                "O  O",   "O  O",   "P",      "   S");

        lines[4] = String.join(" ",
                "OOOO",   "OOOO",   "P",      "SSSS");

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
