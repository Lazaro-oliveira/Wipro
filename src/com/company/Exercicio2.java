package com.company;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Diga seu nome ");
        String nome = s.next();
        System.out.println("Diga sua primeira nota ");
        int nota1 = s.nextInt();
        System.out.println("Diga sua segunda nota ");
        int nota2 = s.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aprovado ");
        } else {
            System.out.println("Reprovado ");
        }
    }
}
