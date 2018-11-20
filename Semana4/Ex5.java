// Pergunta 5:
// Deseja-se implementar um método subString (char[] frase, int ini, int fim) que retorne a parte
// de frase entre as posições ini e fim (inclusive) na forma de um arranjo de caracteres. Por
// exemplo, se frase = {‘T’, ‘e’, ‘s’, ‘t’, ‘a’, ‘n’, ‘d’, ‘o’}, uma chamada a subString(frase, 0, 3) deve
// retornar {‘T’, ‘e’, ‘s’, ‘t’}, enquanto uma chamada a subString(frase, 1, 4) deve 
// retornar {‘e’, ‘s’, ‘t’, ‘a’}. Assinale a alternativa que contém uma implementação correta desse método. Assuma
// que ini e fim são entradas válidas, ou seja, não é necessário testar por valores negativos ou
// maiores do que o tamanho da frase.
//                                                     (n) posições
//                   0    1    2    3    4    5    6    7   (portanto, n+1)
//                                                             8 posições 
// char[] frase =  {'T', 'e', 's', 't', 'a', 'n', 'd', 'o'};

/**
 * Ex5
 */
public class Ex5 {
    static char[] subString(char[] frase, int ini, int fim){
        char[] result = new char[fim-ini+1];

        for(int i=0; i < result.length; i++, ini++ ){
            result[i] = frase[ini];
        }
        return result;
    }
    public static void main(String[] args) {
        char[] frase =  {'T', 'e', 's', 't', 'a', 'n', 'd', 'o'};

        System.out.println(subString(frase, 1, 4));
    }
}