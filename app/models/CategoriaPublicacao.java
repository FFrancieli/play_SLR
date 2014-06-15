package models;

public class CategoriaPublicacao {
	Long IDCategoriaPublicacao;
	String CategoriaPublicacao;
	public CategoriaPublicacao(Long iDCategoriaPublicacao,
			String categoriaPublicacao) {
		IDCategoriaPublicacao = iDCategoriaPublicacao;
		CategoriaPublicacao = categoriaPublicacao;
	}
	public Long getIDCategoriaPublicacao() {
		return IDCategoriaPublicacao;
	}
	public void setIDCategoriaPublicacao(Long iDCategoriaPublicacao) {
		IDCategoriaPublicacao = iDCategoriaPublicacao;
	}
	public String getCategoriaPublicacao() {
		return CategoriaPublicacao;
	}
	public void setCategoriaPublicacao(String categoriaPublicacao) {
		CategoriaPublicacao = categoriaPublicacao;
	}
	
	
}
