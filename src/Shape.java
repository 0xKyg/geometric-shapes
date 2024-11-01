public final class Shape {

    /**
     The class Shape contains methods to generate and draw custom geometrical shapes.
     */


    // No instances
    private Shape() {}



    // METHODS


    /**
     Square method draws a square shape using a specified symbol.

     Parameters:
     - char symbol: The character used to draw the border of the square.
     - int nSide: The length of each side of the square.

     The top and bottom borders consist of the symbol followed by a space.
     The middle rows contain the symbol at the start and end, with spaces in between.
     The number of spaces in the middle rows is calculated based on the total width multiplied by 2 minus the borders.

     */

    public static void square(char symbol, int nSide) {
        // Print the top border of the square
        System.out.printf("%s\n", String.valueOf(symbol).concat(" ").repeat(nSide));

        // Print the middle part of the square
        for (int i = 1; i <= nSide - 2; i++) {
            System.out.printf("%c%s%c\n", symbol, " ".repeat((nSide * 2) - 3), symbol);
        }

        // Print the bottom border of the square
        System.out.printf("%s", String.valueOf(symbol).concat(" ").repeat(nSide));
    }

                        /*
                            Example output for a 10 x 10 square:

                            * * * * * * * * * *
                            *                 *
                            *                 *
                            *                 *
                            *                 *
                            *                 *
                            *                 *
                            *                 *
                            *                 *
                            * * * * * * * * * *
                        */

}

