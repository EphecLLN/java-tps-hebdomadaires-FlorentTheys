package gestionEcole;

import java.time.LocalDate;

public class Etudiants extends Personne {
	private String matricule;
	
	public Etudiants(String nom, String prenom, String dateNaissance, String dateArrivee) throws DateArriveeInvalideException {
		super(nom, prenom, dateNaissance, dateArrivee);
		LocalDate aujdhui = LocalDate.now();
		if (this.dateArrivee.getYear() < 2000 || this.dateArrivee.getYear() > aujdhui.getYear() ) {
			throw new DateArriveeInvalideException("l'année d'arrivée doit être entre l'an 2000 et l'année actuelle");
		}
		String[] tbString = dateArrivee.split("/");
		int anneeInscription = Integer.parseInt(tbString[2]);
		this.matricule = Integer.toString(anneeInscription) + nom.charAt(0) + prenom.charAt(0);
		
	}
	
	@Override
	public int getAnciennete() {
		LocalDate aujhui = LocalDate.now();
		return aujhui.getYear() - this.dateArrivee.getYear();
	}


	@Override
	public String toString() {
		return "nom= " + nom + "\nprenom= " + prenom + "\nage= " + this.getAge() + "\nancienneté= " + this.getAnciennete() +
				"\nmatricule = " + matricule;
	}


	@Override
	public void affiche() {
		System.out.println(this.toString());		
	}
}
