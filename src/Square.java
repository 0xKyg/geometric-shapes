public class Square {

    private char symbol;
    private int nTimes;
    private char direction;

    // TODO: Learn about this keyword calling other constructor
    public Square(char symbol, int nTimes, char direction) {
        setSymbol(symbol);
        setNTimes(nTimes);
        setDirection(direction);
    }

    private void setSymbol (char symbol) {
        this.symbol = symbol;
    }

    private char getSymbol () {
        return symbol;
    }

    private void setNTimes (int nTimes) {
        this.nTimes = nTimes;
    }

    private int getnTimes () {
        return nTimes;
    }

    private void setDirection (char direction) {

        if (Character.toLowerCase(direction) == 'v' || Character.toLowerCase(direction) == 'h' ) {
            this.direction = Character.toLowerCase(direction);
        } else {
            // TODO: Learn about exceptions handling.
            System.err.println("The direction must be (V) vertical or (H) horizontal");
            System.exit(1);
        }

    }

    private char getDirection() {
        return direction;
    }

    public void rectanguleRepresentation(Square square) {
        if (square.getDirection() == 'v') {
            verticalRectangule(square.getSymbol(), square.getnTimes() );
        } else if (square.getDirection() == 'h') {
            horizontalRectangule(square.getSymbol(), square.getnTimes());
        } else {
            System.err.println("The given direction it is not supported");
            System.exit(1);
        }
    }

    private void verticalRectangule(char symbol, int nTimes) {

        System.out.printf("%s\n", String.valueOf(symbol).concat(" ").repeat(nTimes));
        for (int i = 1; i <= nTimes - 2; i++){
            System.out.printf("%c%s%c\n", symbol," ".repeat((nTimes * 2 )- 3), symbol);
        }
        System.out.printf("%s", String.valueOf(symbol).concat(" ").repeat(nTimes));
    }

    private void horizontalRectangule(char symbol, int nTimes) {

    }


}

