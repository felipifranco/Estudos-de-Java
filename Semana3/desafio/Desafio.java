// Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se 
// elas podem ou não formar um triângulo. Caso as 3 retas não possam formar um triangulo,
// peça ao usuário para inserir 3 novos valores, e assim sucessivamente. 
// Caso a retas possam formar um triangulo, chame um novo método para verificar qual o 
// tipo de triangulo que pode ser formado, dado os três valores do tipo double representando 
// os lados do triângulo. Diga se esse triângulo é equilátero (todos os lados iguais), 
// isósceles não equilátero (dois lados iguais e um diferente) ou escaleno (todos os lados diferentes).

import java.util.Scanner;
import java.lang.Math;

public class Desafio {

    
    static void ehTriangulo(double l1, double l2, double l3){
        // se (lado 1 igual ao lado 2) E ( lado 1 igual ao lado 3)
        if(l1 == l2 && l1 == l3){
            System.out.println("Equilatero..");
        } else{ // se nao for (lado 1 igual ao lado 2) E ( lado 1 igual ao lado 2)
            // se (lado 1 igual ao lado 2) OU ( lado 1 igual ao lado 3) OU (lado 2 igual ao lado 3) 
            if( l1 == l2 || l1 == l3 || l2 == l3 ){
                System.out.println("Isosceles..");
            } else { // se nao for (lado 1 igual ao lado 2) OU ( lado 1 igual ao lado 3) OU (lado 2 igual ao lado 3)
                System.out.println("Escaleno..");
            }
        }
        
    }

    //h^2 = c1^2 + c2^2
    static void ehRetangulo(double a, double b, double c) {
        // se (a^2 = b^2 + c^2) OU (b^2 = a^2 + c^2) OU (c^2 = a^2 + b^2)
        if( (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) || (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) || (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) ) {
            System.out.println("Eh retangulo..");
        } else{ // se nao for (a^2 = b^2 + c^2) OU (b^2 = a^2 + c^2) OU (c^2 = a^2 + b^2)
            System.out.println("Nao eh retangulo");
        }
    }

    static boolean check(double lA, double lB, double lC){
        // se for um triangulo... (algoritimo)
        if ((lA < lB + lC) && (lB < lA + lC) && (lC < lA + lB)){
            System.out.println("Eh triangulo...");
            ehTriangulo(lA, lB, lC);
            ehRetangulo(lA, lB, lC);
            return true;
        } else { // se nao for um triangulo
            System.out.println("Nao eh um triangulo...");
            return false;
        }
    }

    public static void main(String[] args) {
        //inicia o scanner
        Scanner input = new Scanner(System.in);
        
        //declaração das variaveis
        double ladoA, ladoB, ladoC;
        
        //faça isso
        do {
            System.out.print("Digite o lado A: ");
            // ladoA recebe valor digitado
            ladoA = input.nextDouble();

            System.out.print("Digite o lado B: ");
            // ladoB recebe valor digitado
            ladoB = input.nextDouble();

            System.out.print("Digite o lado C: ");
            // ladoC recebe valor digitado
            ladoC = input.nextDouble();

        // enquanto isso nao for verdade
        } while (check(ladoA, ladoB, ladoC) == false);

    System.out.print("Fim do programa");
    }
}