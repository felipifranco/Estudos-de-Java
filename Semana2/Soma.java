import java.util.Scanner;

public class Soma {

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.printf("Primeiro numero:");
        num1 = input.nextInt();
        
        System.out.printf("Segundo numero:");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.print(sum);

        input.close();
        
    } 

}