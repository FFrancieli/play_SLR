package models;

public class Prioridade {
	Long IDPrioridadeLeitura;
	String PrioridadeLeitura;
	public Prioridade(Long iDPrioridadeLeitura, String prioridadeLeitura) {
		super();
		IDPrioridadeLeitura = iDPrioridadeLeitura;
		PrioridadeLeitura = prioridadeLeitura;
	}
	public Long getIDPrioridadeLeitura() {
		return IDPrioridadeLeitura;
	}
	public void setIDPrioridadeLeitura(Long iDPrioridadeLeitura) {
		IDPrioridadeLeitura = iDPrioridadeLeitura;
	}
	public String getPrioridadeLeitura() {
		return PrioridadeLeitura;
	}
	public void setPrioridadeLeitura(String prioridadeLeitura) {
		PrioridadeLeitura = prioridadeLeitura;
	}
	
	
}
