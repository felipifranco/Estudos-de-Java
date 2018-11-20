// Pergunta 4:
// Deseja-se implementar um método ehCrescente(int[] vec) que diga se os elementos do vetor
// vec passados como parâmetro estão em ordem crescente ou não. Por exemplo, os vetores {1,
// 3, 3, 4, 6, 7} e {1, 1, 3, 9, 10} estão em ordem crescente, já {1, 2, 1, 2} e {1, 1, 3, 2, 10} não
// estão em ordem crescente. Assinale a alternativa que contém uma implementação correta
// desse método:

//int[] vector = {1, 3, 3, 4, 6, 7};

/**
 * Ex4
 */
public class Ex4 {

    static boolean ehCrescente(int[] vec){

        for(int i=0; i < vec.length-1; i++){
            if( vec[i+1] < vec[i] ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vector = {1, 1, 3, 9, 10};

        System.out.println(ehCrescente(vector)); 
    }
}