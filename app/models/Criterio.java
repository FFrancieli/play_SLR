package models;

public class Criterio {
	long IDCriterio;
	String criterio;
	TipoCriterio tipoCriterio;
	/**
	 * @param iDCriterio
	 * @param criterio
	 * @param tipoCriterio
	 */
	public Criterio(long iDCriterio, String criterio, TipoCriterio tipoCriterio) {
		IDCriterio = iDCriterio;
		this.criterio = criterio;
		this.tipoCriterio = tipoCriterio;
	}
	/**
	 * @return the iDCriterio
	 */
	public long getIDCriterio() {
		return IDCriterio;
	}
	/**
	 * @param iDCriterio the iDCriterio to set
	 */
	public void setIDCriterio(long iDCriterio) {
		IDCriterio = iDCriterio;
	}
	/**
	 * @return the criterio
	 */
	public String getCriterio() {
		return criterio;
	}
	/**
	 * @param criterio the criterio to set
	 */
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}
	/**
	 * @return the tipoCriterio
	 */
	public TipoCriterio getTipoCriterio() {
		return tipoCriterio;
	}
	/**
	 * @param tipoCriterio the tipoCriterio to set
	 */
	public void setTipoCriterio(TipoCriterio tipoCriterio) {
		this.tipoCriterio = tipoCriterio;
	}
	
	
}
