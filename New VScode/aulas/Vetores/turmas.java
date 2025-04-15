package Vetores;

import java.util.Scanner;

public class turmas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int quantidadeTurmas = 0;
        int quantidadeAlunos = 0;
        float nota = 0;
        int quantidadeNotas = 0;
        float mediaAluno = 0;
        float mediaTurma = 0;
        int menorNota = 0;
        int maiorNota = 0;
        float mediaDasTurmas = 0;

        System.out.print("Digite q quantidade de turmas:");
            quantidadeTurmas = leitor.nextInt();
        System.out.print("Digite q quantidade de Alunos:");
            quantidadeAlunos = leitor.nextInt();

        System.out.print("Digite q quantidade de notas por turma:");
            quantidadeNotas = leitor.nextInt();

        int [][] matriz = new int [quantidadeTurmas][quantidadeAlunos];

        for(int i = 0; i < matriz.length; i++){
            System.out.print("Digite a nota do " + (i + 1)+ "º aluno");
            nota = leitor.nextFloat();


        }
        
        
        

       
    }
}
