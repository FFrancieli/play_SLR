package models;

public class StatusPublicacao {
	long idStatusPublicacao;
	String descricaoStatusPublicacao;
	/**
	 * @param idStatusPublicacao
	 * @param descricaoStatusPublicacao
	 */
	public StatusPublicacao(long idStatusPublicacao,
			String descricaoStatusPublicacao) {
		this.idStatusPublicacao = idStatusPublicacao;
		this.descricaoStatusPublicacao = descricaoStatusPublicacao;
	}
	/**
	 * @return the idStatusPublicacao
	 */
	public long getIdStatusPublicacao() {
		return idStatusPublicacao;
	}
	/**
	 * @param idStatusPublicacao the idStatusPublicacao to set
	 */
	public void setIdStatusPublicacao(long idStatusPublicacao) {
		this.idStatusPublicacao = idStatusPublicacao;
	}
	/**
	 * @return the descricaoStatusPublicacao
	 */
	public String getDescricaoStatusPublicacao() {
		return descricaoStatusPublicacao;
	}
	/**
	 * @param descricaoStatusPublicacao the descricaoStatusPublicacao to set
	 */
	public void setDescricaoStatusPublicacao(String descricaoStatusPublicacao) {
		this.descricaoStatusPublicacao = descricaoStatusPublicacao;
	}
	
	
}
