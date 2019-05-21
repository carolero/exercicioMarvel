package br.com.exercicio.marvel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExercicioPersonagem {

	public static void main(String[] args) {
		
		// Declarando o teclado
		Scanner entrada = new Scanner(System.in);
		
		// Declarando o arrayList
		List<String> listaDePersonagens = new ArrayList<String>();
		
		String nomePersonagem = "";
		
		// Usando o while
		while (!nomePersonagem.equalsIgnoreCase("Homem de Ferro")) {
			
			System.out.println("Digite o nome do personagem: ");
			nomePersonagem = entrada.nextLine();
			
			listaDePersonagens.add(nomePersonagem);
			
		}
		
		// Menu
		System.out.println(" Digite uma das seguintes opções:");
		System.out.println("1 para verificar se o personagem já está na lista");
		System.out.println("2 para remover o personagem da lista");
		System.out.println("3 para alterar o personagem");
		System.out.println("4 para ver sua lista de personagens");
		int opcao = entrada.nextInt();
		
		// PROCURANDO
		if (opcao == 1) {
			
			Scanner entradaParaProcurar = new Scanner(System.in);

			System.out.println("Qual personagem quer procurar?");
			String procurar = entradaParaProcurar.nextLine();
			
			if (listaDePersonagens.contains(procurar) == true) {
				System.out.println( procurar + " já está na lista");
			} else {
				System.out.println(procurar + " não está na lista");
			}
			
		// REMOVENDO						
		} else if (opcao == 2) {
			
			Scanner entradaParaRemover = new Scanner(System.in);
			String remover = "";
			System.out.println("Qual personagem quer remover?");
			remover = entradaParaRemover.nextLine();
			
			listaDePersonagens.remove(remover);
			
			System.out.println("Os personagens da lista agora são: ");
			for (String string : listaDePersonagens) {
				System.out.println(string);
			}
			
		// ALTERANDO			
		} else if (opcao == 3) {
			
		
			Scanner entradaParaAlterar = new Scanner(System.in);

			System.out.println("Qual personagem quer alterar?");
			String busca = entradaParaAlterar.nextLine();
			int resultado = listaDePersonagens.indexOf(busca);
			
			
			System.out.println("Digite a alteração");
			String alteracao = entradaParaAlterar.nextLine();
			
			listaDePersonagens.set(resultado, alteracao);
			
			System.out.println("Os personagens da lista agora são: ");
			for (String string : listaDePersonagens) {
				System.out.println(string);
			}
			
		// VER A LISTA COMPLETA
		} else if (opcao == 4) {
			
			System.out.println("Os personagens da sua lista são: ");
			for (String string : listaDePersonagens) {
				System.out.println(string);
			}
					
		} else {
			System.out.println("Opção invalida");
		}
		
		entrada.close();

	}
		
}
