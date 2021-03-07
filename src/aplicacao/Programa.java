package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.xml.crypto.Data;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {



	private static final Data data = null;

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Digite o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Produto # "+(i+1)+" data:");
			System.out.print("Comum,usado ou importado (c,u,i)? ");
			char tipo = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			if (tipo == 'c') {
				lista.add(new Produto(nome, preco));
			}
			else if(tipo == 'u') {
				System.out.print("Data de fabricao: ");
				Date data = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, data));
			}
			else {
				System.out.print("Taxa anduaneira:");
				double taxa = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxa));
			}
		}
	
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO:");
		for (Produto produto : lista) {
			System.out.println(produto.precodia());
		}
	
		
		
		
		
		
		
		
		
		sc.close();
	}

}
