package br.com.ibnl.classes;

/*
* Foi utilizando o encapsulamento para não deixar os atributos da classe serem acessados diretamente,
* com isso, foi gerado os métodos acessores getters e setters;
*/

public class Produto {
	
	private String title;
	private String aVista;
	private String parcelado;
	private String boleto;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getaVista() {
		return aVista;
	}
	public void setaVista(String aVista) {
		this.aVista = aVista;
	}
	public String getParcelado() {
		return parcelado;
	}
	public void setParcelado(String parcelado) {
		this.parcelado = parcelado;
	}
	public String getBoleto() {
		return boleto;
	}
	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}

	
	public Produto(String title, String avista, String parcelado, String boleto) {
		this.getTitle();
		this.getaVista();
		this.getParcelado();
		this.getBoleto();
	}
	
		
	
}
