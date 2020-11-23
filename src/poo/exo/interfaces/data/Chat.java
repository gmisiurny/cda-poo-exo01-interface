package poo.exo.interfaces.data;

public class Chat extends Animal implements ICriant, IMarcheur {
	public Chat(String nom) {
		super(nom);
	}
	@Override
	public String crier() {
		return "Miaou !";
	}
	@Override
	public String marche() {	
		return "Je suis un chat qui marche";
	}
	
	public String grimper() {
		return "Je suis un chat qui grimpe !";
	}
}
