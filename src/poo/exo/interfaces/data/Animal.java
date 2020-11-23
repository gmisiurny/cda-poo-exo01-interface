package poo.exo.interfaces.data;

public abstract class Animal {
	protected String nom;
	
	public Animal(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String respire() {
		return "Je suis un animal qui respire";
	}
}
