public class Main {
    public static void main(String[] args) {
        char symbol = '*';
        int nTimes = 10;

        System.out.printf("%s\n", String.valueOf(symbol).repeat(nTimes));
        for (int i = 1; i <= nTimes - 2; i++){
            System.out.printf("%c%s%c\n", symbol," ".repeat(nTimes - 2), symbol);
        }
        System.out.printf("%s", String.valueOf(symbol).repeat(nTimes));
    }
}