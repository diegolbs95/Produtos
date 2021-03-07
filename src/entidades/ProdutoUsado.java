package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;



public class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	private Date DataDeFabricacao;
	
	public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
		super(nome, preco);
		DataDeFabricacao = dataDeFabricacao;
	}
	
	public Date getDataDeFabricacao() {
		return DataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		DataDeFabricacao = dataDeFabricacao;
	}

	@Override
	public  String precodia() {
		return getNome() + " (usado) $ " + String.format("%.2f", getPreco() ) 
		+ " (Data de Fabricacao: " + sdf.format(DataDeFabricacao) + ")";
	}
	
}
	

	

