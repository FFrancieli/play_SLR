/**
 * 
 */
package models;

/**
 * @author Admin
 *
 */
public class TipoCriterio {
	long IDTipoCriterio;
	String tipoCriterio; //Inclusão ou Exclusão
	/**
	 * @param iDTipoCriterio
	 * @param tipoCriterio
	 */
	public TipoCriterio(long iDTipoCriterio, String tipoCriterio) {
		IDTipoCriterio = iDTipoCriterio;
		this.tipoCriterio = tipoCriterio;
	}
	/**
	 * @return the iDTipoCriterio
	 */
	public long getIDTipoCriterio() {
		return IDTipoCriterio;
	}
	/**
	 * @param iDTipoCriterio the iDTipoCriterio to set
	 */
	public void setIDTipoCriterio(long iDTipoCriterio) {
		IDTipoCriterio = iDTipoCriterio;
	}
	/**
	 * @return the tipoCriterio
	 */
	public String getTipoCriterio() {
		return tipoCriterio;
	}
	/**
	 * @param tipoCriterio the tipoCriterio to set
	 */
	public void setTipoCriterio(String tipoCriterio) {
		this.tipoCriterio = tipoCriterio;
	}
	
	
}
