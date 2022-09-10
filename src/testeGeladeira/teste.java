package testeGeladeira;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> Produto = new ArrayList();
		String ProdutoN = null;
		int num;
		int cont = 1;
		int n;
		 
		 
		do {
			System.out.println("Escolha 1 para inserir, 2 para excluir ou 3 para vizualizar: ");
		    num = input.nextInt();
			
		switch(num) {
		case 1:  {
		
			System.out.println ("Insira um produto: ");
			ProdutoN = input.next();
			Produto.add(ProdutoN);
	
		} break;
		
		case 2: {
			System.out.println("Insira o  produto que deseja excluir: ");
			ProdutoN = input.next();
			Produto.remove(ProdutoN);
			
		}break;
		
			case 3: {
			System.out.println("Lista de Produtos: " + Produto );
		} break;
			
	}
		System.out.println("Digite 1 para continuar ou 2 para encerrar ");
		n = input.nextInt();
		

	} while (n ==1); 
}
}
