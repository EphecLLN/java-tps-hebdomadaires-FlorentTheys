package q2;

import java.util.ArrayList;

public class Bibliotheque {

	private ArrayList<Livre> listeLivre = new ArrayList<Livre>();
	

	public String listeLivres() {
		String livreListe = "";
		for (int i = 0; i < listeLivre.size(); i++) {
			 livreListe += listeLivre.get(i).getTitre() + " - " + listeLivre.get(i).getAuteur() + "\n";
		}
		return "Nombre de livres: " + listeLivre.size() +  "\n" + livreListe;
	}
	
	public void ajouterLivre(Livre liv) {
		listeLivre.add(liv);
	}
}
