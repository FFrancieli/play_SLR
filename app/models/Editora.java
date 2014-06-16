package models;

public class Editora {
	Long IDEditora;
	String editora;
	/**
	 * @param iDEditora
	 * @param editora
	 */
	public Editora(Long iDEditora, String editora) {
		IDEditora = iDEditora;
		this.editora = editora;
	}
	/**
	 * @return the iDEditora
	 */
	public Long getIDEditora() {
		return IDEditora;
	}
	/**
	 * @param iDEditora the iDEditora to set
	 */
	public void setIDEditora(Long iDEditora) {
		IDEditora = iDEditora;
	}
	/**
	 * @return the editora
	 */
	public String getEditora() {
		return editora;
	}
	/**
	 * @param editora the editora to set
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
