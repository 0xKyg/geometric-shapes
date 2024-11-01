public class Main {
    public static void main(String[] args) {
        char symbol = '*';
        int nTimes = 10;

        Rectangule rectangule = new Rectangule(symbol, nTimes, 'V');
        rectangule.rectanguleRepresentation(rectangule);

    }
}