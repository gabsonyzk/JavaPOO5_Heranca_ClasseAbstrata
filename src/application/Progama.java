package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Empresa;
import entities.Individual;

public class Progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		double soma = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do " + i +"º contribuinte: ");
			System.out.print("Pessoa física ou Empresa (f/e)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Rendimento anual: ");
			double rendimentoAnual = sc.nextDouble();
			
			if (ch == 'f') {
				System.out.print("Despesas de saúde: ");
				double gastosComSaude = sc.nextDouble();
				
				list.add(new Individual(nome, rendimentoAnual, gastosComSaude));
				}
			else {
				System.out.print("Número de funcionários: ");
				int numeroDeFuncionarios = sc.nextInt();
				
				list.add(new Empresa(nome, rendimentoAnual, numeroDeFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		
		for (Contribuinte contri: list) {
			System.out.println(String.format(contri.getNome() + " R$ %.2f", contri.imposto()));
			soma += contri.imposto();
		}
		
		System.out.println();
		System.out.println("Impostos Pagos: "+String.format("R$ %.2f", soma));
		sc.close();
	}

}
