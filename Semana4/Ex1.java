// Pergunta 1:
// Deseja-se implementar um método criaVec(int tam, int val) que crie um vetor vec de tamanho
// tam e o inicialize com os valores {val, 2*val, 3*val, ... }.

//Pergunta 2:
// Assinale a alternativa que contém uma implementação possível do método main que
// execute criaVec com parâmetros tam = 10 e val = 3, e então imprima os valores do vetor
// resultante:

/**
 * Ex1
 */
public class Ex1 {
    
    static int[] criaVec(int tam, int val){
        int vec[] = new int[tam];
        // for (int i = 0; i < tam ; i++){
        for (int i = 0; i < vec.length ; i++){
            vec[i] = (i+1)*val;
        }
        return vec;
    }

    public static void main(String[] args) {
        
        int[] vec = criaVec(10, 3);

        // for ( int i = 0 ; i < vec.length ; i++ ){
        //     System.out.print(vec[i] + " ");
        // }

        for( int i : vec){
            System.out.print(i + " ");
        }

    }
}