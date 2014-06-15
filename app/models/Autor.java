package models;

public class Autor {
	Long IDAutor;
	String autor;
	/**
	 * @param iDAutor
	 * @param autor
	 */
	public Autor(Long iDAutor, String autor) {
		super();
		IDAutor = iDAutor;
		this.autor = autor;
	}
	/**
	 * @return the iDAutor
	 */
	public Long getIDAutor() {
		return IDAutor;
	}
	/**
	 * @param iDAutor the iDAutor to set
	 */
	public void setIDAutor(Long iDAutor) {
		IDAutor = iDAutor;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
