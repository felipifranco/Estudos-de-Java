/**
 * JogarBatalha
 */
public class JogarBatalha {

    public static void main(String[] args) {
        BatalhaNaval b1 = new BatalhaNaval(10);
        b1.printBatalhaNaval();
        b1.colocarNavio(0, 0);
        b1.colocarNavio(1, 1);
        b1.colocarNavio(2, 2);
        b1.colocarNavio(3, 3);
        b1.printBatalhaNaval();

        BatalhaNaval b2 = new BatalhaNaval(5);
        b2.printBatalhaNaval();
        b2.colocarNavio(0, 0);
        b2.colocarNavio(0, 1);
        b2.colocarNavio(0, 2);
        b2.colocarNavio(0, 3);
        b2.colocarNavio(0, 4);
        b2.printBatalhaNaval();
    }
}