// Pergunta 3:

// Deseja-se implementar um método distancias(int[] vec) que receba um vetor vec e devolva
// outro vetor contendo as distâncias absolutas entre cada par de valores consecutivos nesse
// vetor. Por exemplo, se vec = {1, 7, 3, 3, 9, -1, 0}, o método deve retornar {6, 4, 0, 6, 10, 1}, ou
// seja {7-1, 7-3, 3-3, 9-3, 9-(-1), e 0-(-1)). Assinale a alternativa que contém uma implementação
// correta desse método:

// int[] vec = {1, 7, 3, 3, 9, -1, 0};
//             {6, 4, 0, 6, 10, 1}

/**
 * Ex3
 */

// import java.lang.Math;

public class Ex3 {
    static int[] distancias(int[] vec){
        int[] result = new int[vec.length-1];

        for(int i=0; i < result.length; i++){
            int dist = vec[i+1] - vec[i];
            
            if(dist < 0){
                dist = (-1)*dist;
            }
            result[i] = dist;
            //result[i] = Math.abs(dist);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] vec = {1, 7, 3, 3, 9, -1, 0};
        int[] vetor = distancias(vec);
        
        for(int i : vetor){
            System.out.print(i + " ");
        }
    }
}