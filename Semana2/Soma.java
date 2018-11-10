import java.util.Scanner;

public class Soma {

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        double sum;

        System.out.printf("Primeiro numero:");
        num1 = input.nextDouble();
        
        System.out.printf("Segundo numero:");
        num2 = input.nextDouble();

        sum = num1 + num2;

        System.out.print(sum);

        input.close();
        
    } 

}