package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        //grupo Lázaro Mendes, LLessa Lobo, Renan Santos, Sebastião Alexsandro
        //execicio 1
        Random random = new Random();
        int numero = random.nextInt(10);

        Scanner s = new Scanner(System.in);

        int digitado = 0;
        int contador = 0;

        do {
            System.out.println("Digite um número de 0 a 10 ");
            digitado = s.nextInt();
            if (digitado > numero) {
                System.out.println("O número digitado é maior que o random ");
            }
            if (digitado < numero) {
                System.out.println("O número digitado é menor que o random ");
            }

            contador++;
        } while (numero != digitado);

        System.out.println("Você tentou " + contador + " vezes");

    }
}
