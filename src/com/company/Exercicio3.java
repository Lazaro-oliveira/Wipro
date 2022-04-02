package com.company;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome1, nome2, nome3, nome4;
        Integer votos1, votos2, votos3, votos4;
        Integer quantidadeDeAlunosDaTurma;
        System.out.println("Escreva o nome do primeiro candidato");
        nome1 = scan.next();
        System.out.println("Escreva o nome do segundo candidato");
        nome2 = scan.next();
        System.out.println("Escreva o nome do terceiro candidato");
        nome3 = scan.next();
        System.out.println("Escreva o nome do quarto candidato");
        nome4 = scan.next();
        System.out.println("Escreva a quantidade de alunos que votaram no candidato: " + nome1);
        votos1 = scan.nextInt();
        System.out.println("Escreva a quantidade de alunos que votaram no candidato: " + nome2);
        votos2 = scan.nextInt();
        System.out.println("Escreva a quantidade de alunos que votaram no candidato: " + nome3);
        votos3 = scan.nextInt();
        System.out.println("Escreva a quantidade de alunos que votaram no candidato: " + nome4);
        votos4 = scan.nextInt();
        System.out.println("Quantidade de votos que : " + nome1 + " recebeu: " + votos1);
        System.out.println("Quantidade de votos que : " + nome2 + " recebeu: " + votos2);
        System.out.println("Quantidade de votos que : " + nome3 + " recebeu: " + votos3);
        System.out.println("Quantidade de votos que : " + nome4 + " recebeu: " + votos4);
        if (votos1 > votos2 && votos1 > votos3 && votos1 > votos4) {
            System.out.println("Candidato: " + nome1 + " recebeu " + votos1 + " votos e foi o(a) vencedor(a)!");
        } else if (votos2 > votos1 && votos2 > votos3 && votos2 > votos4) {
            System.out.println("Candidato: " + nome2 + " recebeu " + votos2 + " votos e foi o(a) vencedor(a)!");
        } else if (votos3 > votos1 && votos3 > votos2 && votos3 > votos4) {
            System.out.println("Candidato: " + nome3 + " recebeu " + votos3 + " votos e foi o(a) vencedor(a)!");
        } else if (votos4 > votos1 && votos4 > votos2 && votos4 > votos3) {
            System.out.println("Candidato: " + nome4 + " recebeu " + votos4 + " votos e foi o(a) vencedor(a)!");
        } else {
            System.out.println("Houve empate!");
        }

        quantidadeDeAlunosDaTurma = votos1 + votos2 + votos3 + votos4;
        System.out.println("E a quantidade de alunos(as) existentes na sala e que votaram foi de: " + quantidadeDeAlunosDaTurma);
        quantidadeDeAlunosDaTurma = scan.nextInt();
    }
}
