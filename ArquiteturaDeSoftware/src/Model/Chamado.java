package Model;

public class Chamado {
	private int idChamado;
	private String descricao;
	private String status;
	private Double DataHora;
	private String DataAberturaFechamento;
		
	public int getIdChamado() {
		return idChamado;
	}
	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}
	public String getDataAberturaFechamento() {
		return DataAberturaFechamento;
	}
	public void setDataAberturaFechamento(String dataAberturaFechamento) {
		DataAberturaFechamento = dataAberturaFechamento;
	}
	public int getidChamado() {
		return idChamado;
	}
	public void setidChamado(int idChamado) {
		this.idChamado = idChamado;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getDataHora() {
		return DataHora;
	}
	public void setDataHora(Double dataHora) {
		DataHora = dataHora;
	}
	
	
	
}
