public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Render OOPS row by row
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("  ", o[i], o[i], p[i], s[i]));
        }
    }

    // Helper method for letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for letter P
    public static String[] buildP() {
        return new String[]{
                " ****** ",
                "*     * ",
                "*     * ",
                " ****** ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Helper method for letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}
