import sun.security.util.Length;

// Texto para as questões 1) e 2):

// Deseja-se implementar um programa em Java que, dado um conjunto de números inteiros,
// gera todos os múltiplos desses números entre 0 e 100. Também deve ser possível imprimir
// todos os valores gerados. Por exemplo, se o conjunto de números for {11, 49}, deve ser
// gerado o seguinte arranjo de arranjos:

// static int[][] geraMultiplos(int[] conjunto) {}
// static void imprimeMatriz(int[][] matriz) {}

// int[] vetor = {11, 49};
            //    0*11, 1*11, 2*11, ..., 9*11
// múltiplos = { {0,    11,   22,   ..., 99}, //múltiplos de 11, de 0 a 100
//               {0,    49,   98} }         //múltiplos de 49, de 0 a 100

public class Ex1e2 {
    static int[][] geraMultiplos(int[] conjunto) {
        // criamos e definimos o numero de linhas da matriz "multiplos" que eh igual ao tamanho de "conjunto" nas linhas
        int[][] multiplos = new int[conjunto.length][];

        // enquanto a matriz tiver linha, 
        for( int i=0; i < conjunto.length ; i++){
            // armazena em "base" o valor da posição do vetor "conjunto" (que eh o multiplo passado)
            int base = conjunto[i];

            // identifica o numero de vezes em q o valor multiplo ("base") pode ser multiplicado
            // instancia a quantidade de colunas do vetor de linha
            multiplos[i] = new int[(100/base) + 1]; // parte inteira de (100/base) + o multiplicador zero

            // para cada coluna da linha de multiplos[i], fazemos uma iteracao por indice
            // entao atribuimos os valores em suas devidas posicoes linha e coluna
            for( int j=0; j < multiplos[i].length; j++){
                // usamos os indices deste vetor coluna para multiplicar com os valores de "base" (ver linha 12)
                multiplos[i][j] = j*base;
            }
        }
        return multiplos;
    }

    static void imprimeMatriz(int[][] matriz) {
        // for( int i=0; i < matriz.length; i++){
        //     for( int j=0; j < matriz[i].length; j++){
        //         System.out.print(matriz[i][j] + " ");
        //     }
        //     System.out.println("");
        // }
        
        for(int[] linhas : matriz){
            for(int val : linhas){
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[] vetor = {11, 49};
        //int[][] matriz = geraMultiplos(vetor);

        imprimeMatriz(geraMultiplos(vetor));
    }
}