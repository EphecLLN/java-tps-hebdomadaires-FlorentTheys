package gestionEcole;

import java.time.LocalDate;

public class Professeur extends Personne {

	public Professeur(String nom, String prenom, String dateNaissance, String dateArrivee) {
		super(nom, prenom, dateNaissance, dateArrivee);
	}

	@Override
	public int getAnciennete() {
		LocalDate aujhui = LocalDate.now();
		int diffNaissArriv = this.dateArrivee.getYear() - this.dateNaissance.getYear();
		if( diffNaissArriv < 23) {
			return aujhui.getYear() - this.dateArrivee.getYear() - (23 - diffNaissArriv);
		} else {
			return aujhui.getYear() - this.dateArrivee.getYear();
		}
	}

	@Override
	public String toString() {
		return "nom= " + nom + "\nprenom= " + prenom + "\nage= " + this.getAge() + "\nancienneté= " + this.getAnciennete();
	}

	@Override
	public void affiche() {
		System.out.println(this.toString());		
	}
}
