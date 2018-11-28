public class Jogar {
    public static void main(String[] args) {
        Tabuleiro t1 = new Tabuleiro(10);
        t1.printTabuleiro();

        System.out.println("Colocando navio em t1 [1][1], [2][2], [3][3], [4][4]:");
        t1.colocarNavio(1, 1);
        t1.colocarNavio(2, 2);
        t1.colocarNavio(3, 3);
        t1.colocarNavio(4, 4);
        t1.printTabuleiro();

        System.out.println("Atirando em [3][3]:");
        System.out.println(t1.atirar(3, 3));
        t1.printTabuleiro();

        System.out.println("Retirando navio em [4][4]:");
        t1.retirarNavio(4, 4);
        t1.printTabuleiro();

        System.out.println("Contando navios:");
        System.out.println(t1.contarNavios());

        System.out.println("\n######################################################\n");




        System.out.println("Criando um novo tabuleiro t2:");
        Tabuleiro t2 = new Tabuleiro(8);
        t2.printTabuleiro();

        System.out.println("Colocando navio em t2 [2][2], [3][3], [4][4]:");
        t2.colocarNavio(5, 5);
        t2.colocarNavio(6, 6);
        t2.colocarNavio(7, 7);
        t2.printTabuleiro();

        System.out.println("Atirando em [5][5]:");
        System.out.println(t2.atirar(5, 5));
        t2.printTabuleiro();

        System.out.println("Atirando em [1][1]:");
        System.out.println(t2.atirar(1, 1));
        t2.printTabuleiro();

        System.out.println("Retirando navio em [6][6]:");
        t2.retirarNavio(6, 6);
        t2.printTabuleiro();

        System.out.println("Contando navios:");
        System.out.println(t2.contarNavios());

        System.out.println("######################################################");

        //imprimindo os resultados dos objetos
        System.out.println("\nImprimindo t1:");
        t1.printTabuleiro();
        System.out.print("Quantidade de navios em t1: ");
        System.out.print(t1.contarNavios());
        System.out.println("");

        System.out.println("\nImprimindo t2:");
        t2.printTabuleiro();
        System.out.print("Quantidade de navios em t2: ");
        System.out.print(t2.contarNavios());
        System.out.println("");

        //System.out.println("######################################################");

        // for (int[] linha : t1.mar) {
        //     for (int valor : linha) {
        //         System.out.print(valor + "  ");
        //     }
        // System.out.println("");
        // }
    }
}