package entidades;

public class ProdutoImportado extends Produto {

	private Double TaxaAnduaneira;

	public ProdutoImportado(String nome, Double preco, Double taxaAnduaneira) {
		super(nome, preco);
		TaxaAnduaneira = taxaAnduaneira;
	}

	public Double getTaxaAnduaneira() {
		return TaxaAnduaneira;
	}

	public void setTaxaAnduaneira(Double taxaAnduaneira) {
		TaxaAnduaneira = taxaAnduaneira;
	}

	public Double PrecoTotal() {
		return getPreco() + getTaxaAnduaneira();
	}
	
	@Override
	public  String precodia() {
		return getNome() + " $ "+ String.format("%.2f", PrecoTotal()) 
		+ "( Taxa Anduaneira: $ "+ String.format("%.2f",getTaxaAnduaneira()) + ")";
	}
	
	

}
