package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		
			System.out.println("Insira os dados da conta");
			System.out.print("Número da conta: ");
			Integer number = tec.nextInt();
			
			System.out.print("Cliente: ");
			tec.next();
			String hoder = tec.nextLine();
			
			System.out.print("Saldo Inicial: R$");
			Double balance = tec.nextDouble();
	
			System.out.print("Limite para Saque: R$");
			Double withdrawLimit =tec.nextDouble();
			
			
			Account cc = new Account(number, hoder, balance, withdrawLimit);
			
			System.out.println("");
			System.out.print("Entre com o valor do saque: R$");
			double amount = tec.nextDouble();
			
		try {
			cc.withdraw(amount);
			System.out.println("Novo saldo : R$"+ String.format("%.2f", cc.getBalance()) );
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		
			tec.close();
		
		
		

	}

}
