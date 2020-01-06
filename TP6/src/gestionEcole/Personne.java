package gestionEcole;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import interfaces.Affichable;

public abstract class Personne implements Affichable {
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	protected String nom;
	protected String prenom;
	protected LocalDate dateNaissance;
	protected LocalDate dateArrivee;
	
	public Personne(String nom, String prenom, String dateNaissance, String dateArrivee) {
		this.nom = nom;
		this.prenom = prenom;
		String[] tbStr = dateNaissance.split("/");
		int jour = Integer.parseInt(tbStr[0]);
		int mois = Integer.parseInt(tbStr[1]);
		int annee = Integer.parseInt(tbStr[2]);
		switch(mois) {
		case 1:
			this.dateNaissance = LocalDate.of(annee, Month.JANUARY, jour);
		break;
		case 2:
			this.dateNaissance = LocalDate.of(annee, Month.FEBRUARY, jour);
		break;
		case 3:
			this.dateNaissance = LocalDate.of(annee, Month.MARCH, jour);
		break;
		case 4:
			this.dateNaissance = LocalDate.of(annee, Month.APRIL, jour);
		break;
		case 5:
			this.dateNaissance = LocalDate.of(annee, Month.MAY, jour);
		break;
		case 6:
			this.dateNaissance = LocalDate.of(annee, Month.JUNE, jour);
		break;
		case 7:
			this.dateNaissance = LocalDate.of(annee, Month.JULY, jour);
		break;
		case 8:
			this.dateNaissance = LocalDate.of(annee, Month.AUGUST, jour);
		break;
		case 9:
			this.dateNaissance = LocalDate.of(annee, Month.SEPTEMBER, jour);
		break;
		case 10:
			this.dateNaissance = LocalDate.of(annee, Month.OCTOBER, jour);
		break;
		case 11:
			this.dateNaissance = LocalDate.of(annee, Month.NOVEMBER, jour);
		break;
		case 12:
			this.dateNaissance = LocalDate.of(annee, Month.DECEMBER, jour);
		break;			
		}
		String[] tbStr1 = dateArrivee.split("/");
		int jour1 = Integer.parseInt(tbStr1[0]);
		int mois1 = Integer.parseInt(tbStr1[1]);
		int annee1 = Integer.parseInt(tbStr1[2]);
		switch(mois1) {
		case 1:
			this.dateArrivee = LocalDate.of(annee1, Month.JANUARY, jour1);
		break;
		case 2:
			this.dateArrivee = LocalDate.of(annee1, Month.FEBRUARY, jour1);
		break;
		case 3:
			this.dateArrivee = LocalDate.of(annee1, Month.MARCH, jour1);
		break;
		case 4:
			this.dateArrivee = LocalDate.of(annee1, Month.APRIL, jour1);
		break;
		case 5:
			this.dateArrivee = LocalDate.of(annee1, Month.MAY, jour1);
		break;
		case 6:
			this.dateArrivee = LocalDate.of(annee1, Month.JUNE, jour1);
		break;
		case 7:
			this.dateArrivee = LocalDate.of(annee1, Month.JULY, jour1);
		break;
		case 8:
			this.dateArrivee = LocalDate.of(annee1, Month.AUGUST, jour1);
		break;
		case 9:
			this.dateArrivee = LocalDate.of(annee1, Month.SEPTEMBER, jour1);
		break;
		case 10:
			this.dateArrivee = LocalDate.of(annee1, Month.OCTOBER, jour1);
		break;
		case 11:
			this.dateArrivee = LocalDate.of(annee1, Month.NOVEMBER, jour1);
		break;
		case 12:
			this.dateArrivee = LocalDate.of(annee1, Month.DECEMBER, jour1);
		break;			
		}
	}
	
	
	public abstract String toString();
	public abstract int getAnciennete();
	
	public int getAge() {
		LocalDate aujdui = LocalDate.now();
		return aujdui.getYear() - this.dateNaissance.getYear();
	}

	
	public static void main(String[] args) throws DateArriveeInvalideException {
		try {
			Etudiants etu1 = new Etudiants("Theys", "Florent", "17/02/1992", args[0]);
		} catch(DateArriveeInvalideException e) {
			System.out.println(e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("paramètre manquant");
		}
	}
}
