package poo.exo.interfaces.data;

public class Sardine extends Animal implements INageur {
	public Sardine(String nom) {
		super(nom);
	}

	@Override
	public String nager() {
		return "Je suis une sardine qui nage !";
	}
	
	public String pondre() {
		return "Je suis une sardine qui pond des oeufs !";
	}
}
