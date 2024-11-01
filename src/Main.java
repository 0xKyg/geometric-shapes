public class Main {
    public static void main(String[] args) {
        char symbol = '*';
        int nTimes = 21;

        Square square = new Square(symbol, nTimes, 'V');
        square.rectanguleRepresentation(square);

    }
}