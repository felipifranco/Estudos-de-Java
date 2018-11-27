// Pergunta 3

// Deseja-se implementar um programa em Java que, dada uma lista com os jogos de diversos
// jogadores e o resultado do sorteio, identifica quais deles acertaram a quadra. Por exemplo, se
// os jogos forem:

// int[][] jogos = {   {1, 2, 3, 4,  5,  6},
//                     {1, 2, 5, 7,  9, 11},
//                     {1, 3, 5, 6,  9, 10},
//                     {2, 3, 4, 5,  6,  7},
//                     {1, 3, 6, 9, 12, 15}
// };

// E o sorteio for:

// int[] sorteio = {1, 3, 5, 6};

// Então o método deve retornar como resultado {true, false, true, false, false}, pois apenas o
// primeiro e o terceiro jogadores acertaram o jogo. Assinale a alternativa que contenha um
// código que completa corretamente o método abaixo, gerando o arranjo de booleanos
// desejado.

// static boolean[] checkQuadra(int[][] jogos, int[] sorteio) {
//     boolean[] ganhou = new boolean[jogos.length];
//     // CÓDIGO A SER UTILIZADO
//     return ganhou;
// }

// retorno -> {true, false, true, false, false}

/**
 * Ex3
 */
public class Ex3 {
    static boolean[] checkQuadra(int[][] jogos, int[] sorteio) {

        // cria um novo vetor de boolean com o numero de jogos feitos (numero de vetores em i)
        boolean[] ganhou = new boolean[jogos.length];
        // CÓDIGO A SER UTILIZADO
        for (int i = 0; i < ganhou.length; i++) {
            // a inicialização padrão de bollean em java é false
            // boolean[] acerto = new boolean[ganhou.length];
            // ou
            boolean[] acerto = {false, false, false, false};
            // então não é preciso inicializar em false

            //
            for (int palpite : jogos[i]) {

                //verifica se o valor do jogo é igual a um dos valores sorteados
                if(palpite == sorteio[0]) {acerto[0] = true;}
                if(palpite == sorteio[1]) {acerto[1] = true;}
                if(palpite == sorteio[2]) {acerto[2] = true;}
                if(palpite == sorteio[3]) {acerto[3] = true;}
                System.out.print(palpite + " ");
            }
            // se o jogo tiver 4 acertos, passa para o vetor ganhou na posição do jogo o valor verdadeiro
            ganhou[i] = acerto[0] && acerto[1] && acerto[2] && acerto[3];
        }
        return ganhou;
    }

    public static void main(String[] args) {
        int[][] jogos = {   {1, 2, 3, 4,  5,  6},
                            {1, 2, 5, 7,  9, 11},
                            {1, 3, 5, 6,  9, 10},
                            {2, 3, 4, 5,  6,  7},
                            {1, 3, 6, 9, 12, 15}
        };
        int[] sorteio = {1, 3, 5, 6};

        boolean[] resultado = checkQuadra(jogos, sorteio);

        for (boolean val : resultado) {
                System.out.print(val + " ");
        }
    }
}
