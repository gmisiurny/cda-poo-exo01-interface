package poo.exo.interfaces.data;

public class Chien extends Animal implements ICriant, IMarcheur {
	public Chien(String nom) {
		super(nom);
	}
	@Override
	public String crier() {
		return "Woof !";
	}
	@Override
	public String marche() {
		return "Je suis un chien qui marche";
	}	
	
	public String flairer() {
		return "Je suis un chien qui flaire !";
	}
}
