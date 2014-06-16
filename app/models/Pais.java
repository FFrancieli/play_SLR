package models;

/**
 * 
 * @author Francieli
 * Define país da publicação
 *
 */

public class Pais {
	long idPais;
	String nomePais;
	public Pais(long idPais, String nomePais) {
		super();
		this.idPais = idPais;
		this.nomePais = nomePais;
	}
	
	
	public long getIdPais() {
		return idPais;
	}
	public void setIdPais(long idPais) {
		this.idPais = idPais;
	}
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	
}
