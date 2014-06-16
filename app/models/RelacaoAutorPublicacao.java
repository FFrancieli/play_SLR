/**
 * 
 */
package models;

/**
 * @author Francieli 
 *
 */
public class RelacaoAutorPublicacao {
	long IDRelacaoAutorPublicacao;
	Autor autor;
	Publicacao publicacao;
	/**
	 * @param iDRelacaoAutorPublicacao
	 * @param autor
	 * @param publicacao
	 */
	public RelacaoAutorPublicacao(long iDRelacaoAutorPublicacao, Autor autor,
			Publicacao publicacao) {
		IDRelacaoAutorPublicacao = iDRelacaoAutorPublicacao;
		this.autor = autor;
		this.publicacao = publicacao;
	}
	/**
	 * @return the iDRelacaoAutorPublicacao
	 */
	public long getIDRelacaoAutorPublicacao() {
		return IDRelacaoAutorPublicacao;
	}
	/**
	 * @param iDRelacaoAutorPublicacao the iDRelacaoAutorPublicacao to set
	 */
	public void setIDRelacaoAutorPublicacao(long iDRelacaoAutorPublicacao) {
		IDRelacaoAutorPublicacao = iDRelacaoAutorPublicacao;
	}
	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	/**
	 * @return the publicacao
	 */
	public Publicacao getPublicacao() {
		return publicacao;
	}
	/**
	 * @param publicacao the publicacao to set
	 */
	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
	
	
	
	
}
