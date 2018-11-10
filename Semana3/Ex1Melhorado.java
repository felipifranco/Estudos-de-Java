import java.util.Scanner;
import java.lang.Math;
public class Ex1Melhorado {

    static void ehTriangulo(double l1, double l2, double l3) {
        //System.out.println("Entrou no metodo ehtriangulo");
        if(l1 == l2 && l1 == l3){
            System.out.println("Equilatero");
        } else {
            if(l1 == l2 || l1 == l3 || l2 == l3){
                System.out.println("Isosceles nao equilatero");
            } else {
                System.out.println("Escaleno");
            }
        }
        //System.out.println("Acabou o metodo ehtriangulo");
    }
    static void ehRetangulo(double l1, double l2, double l3) {
        if((Math.pow(l1, 2) == Math.pow(l2, 2) + Math.pow(l3, 2)) || (Math.pow(l2, 2) == Math.pow(l1, 2) + Math.pow(l3, 2)) || (Math.pow(l3, 2) == Math.pow(l1, 2) + Math.pow(l2, 2)) ){
            System.out.println("O triangulo eh retangulo");
        } else {
            System.out.println("O triangulo nao eh retangulo");
        }
    }

    static boolean checkTriangulo(double l1, double l2, double l3) {
        //System.out.println("Entrou no metodo checkTriangulo");
        // Embora o operador ^ seja "padrao" nas linguagens em geral, ele não existe no Java (ou melhor, o operador até existe mas é outra coisa, é o "OU EXCLUSIVO" binário).
        // Como foi dito, de forma geral se utiliza o Math.pow, mas para este caso acho desnecessário. Se é apenas para elevar ao quadrado fica mais legível fazer simplesmente (r*r)
        //if((Math.pow(l1, 2) == Math.pow(l2, 2) + Math.pow(l3, 2)) || (Math.pow(l2, 2) == Math.pow(l1, 2) + Math.pow(l3, 2)) || (Math.pow(l3, 2) == Math.pow(l1, 2) + Math.pow(l2, 2)) ){
        if((l1 < l2 +l3) && (l2 < l1 + l3) && (l3 < l1 + l2)){
            ehRetangulo(l1, l2, l3);
            ehTriangulo(l1, l2, l3);
            return true;
        } else{
            System.out.println("Os valores digitados nao pertencem a um triangulo. ");
            return false;
        }
        //System.out.println("Acabou o metodo checkTriangulo");
    }
    public static void main(String[] args) {
        //System.out.println("Entrou no metodo main");
        Scanner input = new Scanner(System.in);
        double ladoA, ladoB, ladoC;

        do {
            System.out.print("Digite o lado a do triangulo: ");
            ladoA = input.nextDouble();

            System.out.print("Digite o lado b do triangulo: ");
            ladoB = input.nextDouble();

            System.out.print("Digite o lado c do triangulo: ");
            ladoC = input.nextDouble();
            //checkTriangulo(ladoA, ladoB ,ladoC);

        } while (checkTriangulo(ladoA, ladoB ,ladoC)==false);

        input.close();

        //System.out.println("Acabou o metodo main");
    }
}