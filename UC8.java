import java.util.HashMap;

public class UC8 {

    /**
     * UC8 – Use Map for Character Patterns and Render via Function
     * Goal: Allow easy lookup and reuse of letter patterns
     * using HashMap for efficient key-value storage.
     */

    // Create and initialize the character pattern map
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        charMap.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return charMap;
    }

    // Display banner using the character map
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch,
                                 charMap.get(' '));

                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}