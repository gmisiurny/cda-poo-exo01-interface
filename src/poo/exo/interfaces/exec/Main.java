package poo.exo.interfaces.exec;

import poo.exo.interfaces.data.Chat;
import poo.exo.interfaces.data.Chien;
import poo.exo.interfaces.data.IMarcheur;
import poo.exo.interfaces.data.INageur;
import poo.exo.interfaces.data.Sardine;
import java.util.ArrayList;

import poo.exo.interfaces.data.Animal;

public class Main {

	public static void main(String[] args) throws Exception{
		Chien chien1 = new Chien("Pluto");
		Chien chien2 = new Chien("Beethoven");
		
		Chat chat1 = new Chat("Garfield");
		Chat chat2 = new Chat("Felix");
		Chat chat3 = new Chat("Azraël");
		
		Sardine sard1 = new Sardine("Clupea harengus");
		Sardine sard2 = new Sardine("Sardina pilchardus");
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(chien1);
		list.add(chien2);
		list.add(chat1);
		list.add(chat2);
		list.add(chat3);
		list.add(sard1);
		list.add(sard2);
		
		for (Animal animal : list) {
			System.out.println(animal.respire());
			if (animal instanceof IMarcheur) {
				System.out.println(animal.getNom() + " " + ((IMarcheur) animal).marche());
				if (animal instanceof Chat) {
					System.out.println(((Chat) animal).grimper() + "\n");
				} else if (animal instanceof Chien) {
					System.out.println(((Chien) animal).flairer() + "\n");
				}
			}
			if (animal instanceof INageur) {
				System.out.println(animal.getNom() + " " + ((INageur) animal).nager());
				if (animal instanceof Sardine) {
					System.out.println(((Sardine) animal).pondre() + "\n");
				}
			}
		}

	}

}
