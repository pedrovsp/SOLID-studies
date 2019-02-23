import java.util.List;

public class GeradorDeNotaFiscal {
		
	private List<AcaoAposGerarNota> acoes;
	
	public  GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}
	
	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();
		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobre0(valor));
		
		for (AcaoAposGerarNota acao: acoes) {
			acao.executa(nf);
		}
		
		return nf;
	}
	
	private double impostoSimplesSobre0(double valor) {
		return valor * 0.06;
	}
}
