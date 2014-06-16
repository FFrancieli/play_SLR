/**
 * 
 */
package models;

/**
 * @author Francieli
 *
 */
public class Fase {
	long IDFase;
	String fase;
	/**
	 * @param iDFase
	 * @param fase
	 */
	public Fase(long iDFase, String fase) {
		IDFase = iDFase;
		this.fase = fase;
	}
	/**
	 * @return the iDFase
	 */
	public long getIDFase() {
		return IDFase;
	}
	/**
	 * @param iDFase the iDFase to set
	 */
	public void setIDFase(long iDFase) {
		IDFase = iDFase;
	}
	/**
	 * @return the fase
	 */
	public String getFase() {
		return fase;
	}
	/**
	 * @param fase the fase to set
	 */
	public void setFase(String fase) {
		this.fase = fase;
	}
	
	
	
}
