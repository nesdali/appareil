package app;

public class Contact {
	private int numero;
	private String nom;
	private String numeroTel;
	private Appel appel;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appel getAppel() {
		return appel;
	}
	public void setAppel(Appel appel) {
		this.appel = appel;
	}
	public Contact(int numero, String nom, String numeroTel) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.numeroTel = numeroTel;
	}
	
	

}
