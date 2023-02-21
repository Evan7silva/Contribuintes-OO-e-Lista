package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPlayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPlayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do " + (i+1) + "° contribuinte: ");
			System.out.print("Renda anual com salário: ");
			double rendaAnual = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double rendaServico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double rendaCapital = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			double gastosMedico = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double gastosEducacionais = sc.nextDouble();
			System.out.println();
			TaxPlayer taxPlayer = new TaxPlayer(rendaAnual, rendaServico, rendaCapital, gastosMedico, gastosEducacionais);
			list.add(taxPlayer);
		}
		
		int i = 0;
		for (TaxPlayer taxPlayer : list) {
			System.out.println("Resumo do " + (i + 1) + "º contribuinte:");
			System.out.println(taxPlayer);
			i = 1;
		}
		sc.close();

	}

}
