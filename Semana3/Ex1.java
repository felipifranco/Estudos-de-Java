/**
 * Ex1
 */
public class Ex1 {

    static void checkTriangulo(double l1, double l2, double l3){
        if(l1 == l2 && l1 == l3){
            System.out.println("Equilatero");
        } else {
        if(l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("Isosceles nao equilatero");
        } else {
            System.out.println("Escaleno");
        }
        }
    }

    public static void main(String[] args) {
        checkTriangulo(3,4,5);
    }
}