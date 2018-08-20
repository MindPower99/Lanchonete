package Lanchonete;
import java.util.Scanner;

public class FoodTruck {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		
		
		while (opcao <= 3) 
		{
			System.out.println("===========Lanchonete=========");
			System.out.println("1 - Registrar pedido");
			System.out.println("2 - Registrar ganhos e gastos");
			System.out.println("3 - Grade de horários e funcionários");
			System.out.println("4 - Sair");
			System.out.print("Digite a opção:");
			
			opcao = input.nextInt();
			
			switch (opcao) 
			{
				case 1:
					
					int menu = 0;
					while (menu <= 5)
					
					{

					System.out.println("==============Menu================");
					System.out.println("1 - Cachorro Quente | R$ 7,00");
					System.out.println("2 -    Carne Maluca | R$ 10,00");
					System.out.println("3 -       X - Bacon | R$ 12,00");
					System.out.println("4 -   X - Calabresa | R$ 10,00");
					System.out.println("5 -        X - Tudo | R$ 14,00");
					System.out.println("6 - Sair");
					
					int quant = 0;
					int acompanhamento = 0;
					int quantbebida = 0;
					double preco = 0;
					
					menu = input.nextInt();
					
					switch (menu) 
					{
						
						case 1:
							
							System.out.print("Quantidade desejada: ");
							quant = input.nextInt();
							
							System.out.println("Acompanhamento:");
							System.out.println("1 - Refrigerante 300ml | R$ 4,00");
							System.out.println("2 - Suco 300ml         | R$ 3,00");
							System.out.println("3 - Água 300ml         | R$ 2,50");
							System.out.println("4 - Dolly 600ml        | R$ 5,00");
							System.out.println("5 - Coca 600ml         | R$ 6,00");
							System.out.println("6 - Nenhum acompanhamento");
							
							acompanhamento = input.nextInt();
							quantbebida = 0;
							preco = 0;
							
							switch (acompanhamento) 
							{
								case 1:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (7 * quant) + (4 *quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 2: 
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (7 * quant) + (3 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 3:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (7 * quant) + (2.50 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 4:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (7 * quant) + (5 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
									
								case 5:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (7 * quant) + (6 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 6:
									preco = 7 * quant;
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								default: 
									System.out.println("Digite uma opção válida");
							}
							break;
							
						case 2:
							
							System.out.print("Quantidade desejada: ");
							quant = input.nextInt();
							
							System.out.println("Acompanhamento:");
							System.out.println("1 - Refrigerante 300ml | R$ 4,00");
							System.out.println("2 - Suco 300ml         | R$ 3,00");
							System.out.println("3 - Água 300ml         | R$ 2,50");
							System.out.println("4 - Dolly 600ml        | R$ 5,00");
							System.out.println("5 - Coca 600ml         | R$ 6,00");
							System.out.println("6 - Nenhum acompanhamento");
							
							acompanhamento = input.nextInt();
							quantbebida = 0;
							preco = 0;
							
							switch (acompanhamento) 
							{
								case 1:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (10 * quant) + (4 *quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 2: 
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (10 * quant) + (3 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 3:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (10 * quant) + (2.50 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 4:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (10 * quant) + (5 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
									
								case 5:
									System.out.println("Quantidade: ");
									quantbebida = input.nextInt();
									preco = (10 * quant) + (6 * quantbebida);
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								case 6:
									preco = 10 * quant;
									System.out.println("O valor é: R$ "+preco);
									quantbebida = 0;
									preco = 0;
									quant = 0;
									break;
								
								default: 
									System.out.println("Digite uma opção válida");
							}
							break;
							
							
							
					}
					
					}
					
					break;
			}
			
		}
		
	}

}
