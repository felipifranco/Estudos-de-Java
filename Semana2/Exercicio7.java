/* 
Escreva um método que determine quanto tempo leva para um corpo cair de determinada altura a partir do repouso.
Este método receberá como parâmetro um valor do tipo double contendo a altura em centímetros em que o corpo está, 
e deverá retornar um valor do tipo double contendo o tempo da queda em segundos. 
Considere que a força da gravidade é igual a 9, 8m/s2. Use o método Math.sqrt()1 para obter a raiz quadrada. 
 */

/**
 * Exercicio7
 */
public class Exercicio7 {

    static double tempoDeQueda(double alturaEmCentimetros){
        return Math.sqrt(2*alturaEmCentimetros/100/9.8);
    }

    static double tempoDeQueda_Alternativo(int alturaEmCentimetros){
        double alturaEmMetros = alturaEmCentimetros/100;
        double gravidade = 9.8;
        return Math.sqrt(2*alturaEmMetros/gravidade);
    }

    public static void main(String[] args) {
        //resolução 1
        System.out.println(tempoDeQueda(99.9999999));

        //resolução 2
        System.out.println(tempoDeQueda_Alternativo(100));
        
    }
}




