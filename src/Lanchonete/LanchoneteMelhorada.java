package Lanchonete;
import java.util.Scanner;

public class LanchoneteMelhorada 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		int pedido;
		double quantidade,valor;
		
		System.out.println("=========Lanchonete========");
		System.out.println("1 - Cachorro Quente | R$ 7,00");
		System.out.println("2 - X - Calabresa | R$ 9,00");
		System.out.println("3 - X - Bacon | R$ 12,00");
		System.out.println("4 - X - Salada | R$ 8,00");
		System.out.println("5 - Especial | R$ 12,00");
		System.out.println("6 - Refrigerante/latinha | R$ 4,00");
		System.out.print("Informe o código: ");
		
		pedido = input.nextInt();
		
		switch (pedido) 
		{
		
			case 1: 
				System.out.print("Digite a quantidade desejada: ");
				quantidade = input.nextDouble();
				valor = quantidade * 7;
				System.out.print("Preço = R$ "+valor);
				break;
			
			case 2: 
				System.out.print("Digite a quantidade desejada: ");
				quantidade = input.nextDouble();
				valor = quantidade * 9;
				System.out.print("Preço = R$ "+valor);
				break;
				
			case 3: 
				System.out.print("Digite a quantidade desejada: ");
				quantidade = input.nextDouble();
				valor = quantidade * 12;
				System.out.print("Preço = R$ "+valor);
				break;
				
			case 4: 
				System.out.print("Digite a quantidade desejada: ");
				quantidade = input.nextDouble();
				valor = quantidade * 8;
				System.out.print("Preço = R$ "+valor);
				break;
				
			case 5: 
				System.out.print("Digite a quantidade desejada: ");
				quantidade = input.nextDouble();
				valor = quantidade * 12;
				System.out.print("Preço = R$ "+valor);
				break;
				
			case 6: 
				System.out.print("Digite a quantidade desejada: ");
				quantidade = input.nextDouble();
				valor = quantidade * 4;
				System.out.print("Preço = R$ "+valor);
				break;
				
			default:
				System.out.print("Código inválido");
				break;
		}
		
	}
		
		

}

