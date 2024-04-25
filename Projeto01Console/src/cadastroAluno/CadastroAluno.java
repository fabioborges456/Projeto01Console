package cadastroAluno;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroAluno {
	public static void main(String[]args) {
		ArrayList<Aluno>alunos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Menu:");
			System.out.println("1.Cadastrar aluno");
			System.out.println("2.Mostrar todos os alunos cadastrados");
			System.out.println("3.Sair");
			System.out.print("Escolha uma opção:");
			int opcao = sc.nextInt();
			
		if(opcao ==1) {
			System.out.print("Digite o nome do aluno:");
			String nome = sc.next();
			System.out.print("Digite a idade do aluno:");
			int idade = sc.nextInt();
			System.out.print("Digite a nota do aluno:");
			double nota = sc.nextDouble();
			
			Aluno aluno = new Aluno(nome,idade,nota);
			alunos.add(aluno);
			System.out.println("Aluno cadastrado com sucesso!");
			
		}else if(opcao ==2) {
			System.out.println("Alunos cadastrados:");
			for(Aluno aluno: alunos) {
			System.out.println(aluno);	
			}	
		}else if(opcao ==3) {
			System.out.println("Saindo...");
			break;
		}else {
			System.out.println("Opção invalida. Tente novamente");		
	  }
    }
		sc.close();
  }
}
