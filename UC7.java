import java.util.ArrayList;
import java.util.List;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store all character patterns
        List<CharacterPatternMap> patternList = new ArrayList<>();

        patternList.add(new CharacterPatternMap('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        }));

        patternList.add(new CharacterPatternMap('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        }));

        patternList.add(new CharacterPatternMap('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        }));

        String word = "OOPS";

        // Print banner row by row
        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                for (CharacterPatternMap map : patternList) {

                    if (map.getCharacter() == c) {
                        line.append(map.getPattern()[row]).append("  ");
                    }

                }

            }

            System.out.println(line);
        }
    }
}
